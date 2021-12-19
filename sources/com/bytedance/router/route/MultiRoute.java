package com.bytedance.router.route;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0569a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

public final class MultiRoute extends BaseRoute {
    static {
        Covode.recordClassIndex(25905);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.router.route.BaseRoute
    public final MultiRouteIntent getRouteIntent() {
        RouteIntent routeIntent = super.getRouteIntent();
        if (routeIntent != null) {
            return (MultiRouteIntent) routeIntent;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.router.route.IRoute
    public final void open(Context context) {
        C89219l.m154719c(context, "");
        ArrayList<BaseRoute> routes = getRouteIntent().getRoutes();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) routes, 10));
        Iterator<T> it = routes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getComponent(context));
        }
        Object[] array = arrayList.toArray(new Intent[0]);
        if (array != null) {
            C0569a.m2373a(context, (Intent[]) array, getRouteIntent().getAnimationBundle());
            RouteManager instance = RouteManager.getInstance();
            C89219l.m154709a((Object) instance, "");
            instance.getRouteCallbackProxy().onSuccess(null);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
