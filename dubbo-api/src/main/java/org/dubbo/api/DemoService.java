package org.dubbo.api;

import java.util.List;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午1:37 18/3/29
 */

public interface DemoService {
    List<String> getPermissions(Long id);
}
