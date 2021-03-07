package cn.zjn.test.springboot.service.impl;

import cn.zjn.test.springboot.domain.User;
import cn.zjn.test.springboot.service.TokenService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/30 18:10
 * Note:
 */
@Service("TokenService")
public class TokenServiceImpl implements TokenService {

    @Override
    public String getToken(User user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(user.getUSERNAME()).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getPASSWORD()));
        return token;
    }
}
