package com.bytedance.router.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RewriteManager implements IInterceptor {
    private Object mLockObject = new Object();
    private Map<String, String> mRewriteMap;

    static {
        Covode.recordClassIndex(25889);
    }

    public String getRewriteUrl(String str) {
        Map<String, String> map = this.mRewriteMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void setRewriteMap(Map<String, String> map) {
        MethodCollector.m26663i(10809);
        synchronized (this.mLockObject) {
            if (map == null) {
                try {
                    this.mRewriteMap = Collections.EMPTY_MAP;
                } catch (Throwable th) {
                    MethodCollector.m26664o(10809);
                    throw th;
                }
            } else {
                this.mRewriteMap = map;
            }
        }
        MethodCollector.m26664o(10809);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Map<String, String> map;
        String originUrl = routeIntent.getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return false;
        }
        String routeUrl = Util.getRouteUrl(originUrl);
        if (!(TextUtils.isEmpty(routeUrl) || (map = this.mRewriteMap) == null || map.size() == 0)) {
            String str = this.mRewriteMap.get(routeUrl);
            if (!TextUtils.isEmpty(str)) {
                routeIntent.setUrl(str);
                return true;
            }
        }
        return false;
    }

    public void addRewriteValue(String str, String str2) {
        MethodCollector.m26663i(10810);
        synchronized (this.mLockObject) {
            try {
                if (this.mRewriteMap == null) {
                    this.mRewriteMap = new HashMap();
                }
                this.mRewriteMap.put(str, str2);
            } finally {
                MethodCollector.m26664o(10810);
            }
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Logger.m41576d("RewriteManager#RouteIntent-originUrl: " + routeIntent.getOriginUrl());
        Logger.m41576d("RewriteManager#RouteIntent-outputUrl: " + routeIntent.getUrl());
        new RouteIntent.Builder(routeIntent.getUrl()).build();
        return false;
    }
}
