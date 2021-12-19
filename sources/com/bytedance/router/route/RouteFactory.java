package com.bytedance.router.route;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.net.Uri;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RoutesConfig;
import com.bytedance.router.util.Logger;

public class RouteFactory {
    static {
        Covode.recordClassIndex(25906);
    }

    private static boolean isSchemeLegal(String str, RoutesConfig routesConfig) {
        if (str.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String str2 : otherSchemes) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static BaseRoute createRoute(RouteIntent routeIntent, String str, RoutesConfig routesConfig) {
        if (routeIntent instanceof MultiRouteIntent) {
            return new MultiRoute();
        }
        String url = routeIntent.getUrl();
        Class<?> cls = null;
        if (TextUtils.isEmpty(url)) {
            Logger.m41578e("RouteFactory#createRoute url is null!!!");
            return null;
        }
        Uri parse = Uri.parse(url);
        if (!parse.isHierarchical()) {
            Logger.m41578e("RouteFactory#createRoute url is not illegal!!!");
            return null;
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            Logger.m41578e("RouteFactory#createRoute scheme is null!!!");
            return null;
        }
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            Logger.m41578e("RouteFactory#createRoute host is null!!!");
            return null;
        } else if (!isSchemeLegal(scheme, routesConfig)) {
            Logger.m41578e(C1764a.m5928a("RouteFactory#createRoute router cannot support this scheme protocol: %s\nRouteConfig:\n%s", new Object[]{routeIntent.getUrl(), routesConfig.toString()}));
            return null;
        } else if (host.startsWith("bt.")) {
            Class<? extends BaseRoute> routeClass = routesConfig.getRouteClass(host);
            if (routeClass == null) {
                Logger.m41578e("RouteFactory#createRoute there is no route for this host: ".concat(String.valueOf(host)));
                return null;
            }
            try {
                return (BaseRoute) routeClass.newInstance();
            } catch (Exception e) {
                Logger.m41578e("RouteFactory#createRoute routeClass new instance exception!!!");
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            } catch (Throwable unused) {
            }
            if (cls != null) {
                if (Service.class.isAssignableFrom(cls)) {
                    return new ServiceRoute();
                }
                if (BroadcastReceiver.class.isAssignableFrom(cls)) {
                    return new BroadcastRoute();
                }
                if (IRouteAction.class.isAssignableFrom(cls)) {
                    return new ActionRoute(cls);
                }
            }
            return new ActivityRoute();
        }
    }
}
