package paas.rey.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import paas.rey.enums.BizCodeEnum;
import paas.rey.request.UserLoginRequest;
import paas.rey.request.UserRegisterRequest;
import paas.rey.service.FileService;
import paas.rey.service.UserService;
import paas.rey.utils.JsonData;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yeycrey
 * @since 2024-12-23
 */
@Api(tags = "用户模块")
@RestController
@RequestMapping("/api/v1/userDO")
public class UserController {
        @Autowired
        private FileService fileService;
        @Autowired
        private UserService userService;


        @ApiOperation("上传用户头像")
        @PostMapping("/uploadUserImage")
        public JsonData upLoadUserImage(@ApiParam(value = "上传文件",required = true)
                                                @RequestPart("file") MultipartFile file){
                String str = fileService.uploadUserImg(file);
                return str != null ? JsonData.buildSuccess(str) : JsonData.buildError(BizCodeEnum.ACCOUNT_UNREGISTER.name());
        }



        @ApiOperation("注册邮箱")
        @PostMapping("/registerMail")
        public JsonData reigsterMail(@RequestBody UserRegisterRequest userRegisterRequest){
                return userService.registerMail(userRegisterRequest);
        }


        @ApiOperation("用户登录")
        @PostMapping("/login")
        public JsonData login(@RequestBody UserLoginRequest userLoginRequest){
                return userService.login(userLoginRequest);
        }
}

