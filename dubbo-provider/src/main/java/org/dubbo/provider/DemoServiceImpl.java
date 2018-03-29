package org.dubbo.provider;

import org.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午1:42 18/3/29
 */

public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
