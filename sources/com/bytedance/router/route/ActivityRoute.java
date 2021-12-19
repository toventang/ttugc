package com.bytedance.router.route;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0569a;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

public class ActivityRoute extends SysComponentRoute {
    static {
        Covode.recordClassIndex(25900);
    }

    /* renamed from: com_bytedance_router_route_ActivityRoute_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m41565x643672ce(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.route.SysComponentRoute
    public void openComponent(Context context, Intent intent) {
        RouteIntent routeIntent = getRouteIntent();
        if (!(context instanceof Activity)) {
            applicationStart(context, routeIntent, intent);
        } else if (getRouteIntent().getAnimationBundle() == null) {
            normalStart(context, routeIntent, intent);
        } else {
            activityCompatStart(context, routeIntent, intent);
        }
    }

    private void activityCompatStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        C0569a.m2372a(context, intent, getRouteIntent().getAnimationBundle());
    }

    private void applicationStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        intent.addFlags(268435456);
        m41565x643672ce(context, intent);
        if (routeIntent.hasRequestCode()) {
            Logger.m41578e("SmartRoute.open(int requestCode):the context must be Activity !!!");
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            Logger.m41578e("SmartRoute.withAnimation(int enterAnim, int exitAnim):the context must be Activity !!!");
        }
    }

    private void normalStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        if (routeIntent.hasRequestCode()) {
            Activity activity = (Activity) context;
            Fragment fragment = routeIntent.getFragment();
            if (fragment != null) {
                fragment.startActivityForResult(intent, routeIntent.getRequestCode());
            } else if (routeIntent.getOnActivityResultCallback() == null || !(activity instanceof ActivityC0945e)) {
                activity.startActivityForResult(intent, routeIntent.getRequestCode());
            } else {
                FakeFragment fakeFragment = new FakeFragment();
                fakeFragment.setCallback(routeIntent.getOnActivityResultCallback());
                ((ActivityC0945e) activity).getSupportFragmentManager().mo3552a().mo3456a(fakeFragment, new StringBuilder().append(System.currentTimeMillis()).toString()).mo3476d();
                fakeFragment.startActivityForResult(intent, routeIntent.getRequestCode());
            }
        } else {
            m41565x643672ce(context, intent);
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            ((Activity) context).overridePendingTransition(getRouteIntent().getEnterAnim(), getRouteIntent().getExitAnim());
        }
    }
}
