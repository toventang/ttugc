package com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OpenResultCallback$$CC;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouteSet;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.a */
public abstract class AbstractC41006a implements AbstractC41014c {
    public static final C41007a Companion = new C41007a((byte) 0);

    static {
        Covode.recordClassIndex(48876);
    }

    /* renamed from: com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m82626xbd11384c(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
        OpenResultCallback$$CC.onEmpty(this);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onOpen(Intent intent) {
        OpenResultCallback$$CC.onOpen(this, intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.a$a */
    public static final class C41007a {
        static {
            Covode.recordClassIndex(48877);
        }

        private C41007a() {
        }

        public /* synthetic */ C41007a(byte b) {
            this();
        }
    }

    public final String getActionName() {
        String name = getClass().getName();
        C89219l.m154716b(name, "");
        return name;
    }

    public void onActionIntercept() {
        m82626xbd11384c("BaseAction", getActionName() + " --> outer, on link action intercept");
    }

    public void onActionPreHandleFinish() {
        m82626xbd11384c("BaseAction", getActionName() + " --> outer, on link action preHandle finish");
    }

    public void onActionStart() {
        m82626xbd11384c("BaseAction", getActionName() + " --> outer, on link action start");
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
        m82626xbd11384c("BaseAction", getActionName() + " --> on link action result");
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
        m82626xbd11384c("BaseAction", getActionName() + " --> on link success");
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
        m82626xbd11384c("BaseAction", getActionName() + " --> on link intercept, link url is " + str);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
        m82626xbd11384c("BaseAction", getActionName() + " --> on link matched, link url is " + str);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
        m82626xbd11384c("BaseAction", getActionName() + " --> on link missed, link url is " + str);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
        m82626xbd11384c("BaseAction", getActionName() + " --> on link fail, link url is " + str + ", error is " + str2);
    }

    public boolean doRealOpen(Context context, String str, HashMap<String, Object> hashMap, ArrayList<Integer> arrayList) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Integer) {
                Object value2 = entry.getValue();
                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.Int");
                buildRoute.withParam(entry.getKey(), ((Integer) value2).intValue());
            } else if (value instanceof Long) {
                Object value3 = entry.getValue();
                Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.Long");
                buildRoute.withParam(entry.getKey(), ((Long) value3).longValue());
            } else if (value instanceof Float) {
                Object value4 = entry.getValue();
                Objects.requireNonNull(value4, "null cannot be cast to non-null type kotlin.Float");
                buildRoute.withParam(entry.getKey(), ((Float) value4).floatValue());
            } else if (value instanceof Double) {
                Object value5 = entry.getValue();
                Objects.requireNonNull(value5, "null cannot be cast to non-null type kotlin.Double");
                buildRoute.withParam(entry.getKey(), ((Double) value5).doubleValue());
            } else if (value instanceof Boolean) {
                Object value6 = entry.getValue();
                Objects.requireNonNull(value6, "null cannot be cast to non-null type kotlin.Boolean");
                buildRoute.withParam(entry.getKey(), ((Boolean) value6).booleanValue());
            } else if (value instanceof String) {
                Object value7 = entry.getValue();
                Objects.requireNonNull(value7, "null cannot be cast to non-null type kotlin.String");
                buildRoute.withParam(entry.getKey(), (String) value7);
            }
        }
        if (arrayList != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C89219l.m154716b(next, "");
                buildRoute.addFlags(next.intValue());
            }
        }
        SmartRouteSet buildRoute2 = SmartRouteSet.Companion.buildRoute(context);
        C89219l.m154716b(buildRoute, "");
        buildRoute2.addRoute(buildRoute);
        buildRoute2.withCallBack(this).open();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.deeplink.actions.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean doRealOpen$default(AbstractC41006a aVar, Context context, String str, HashMap hashMap, ArrayList arrayList, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                arrayList = null;
            }
            return aVar.doRealOpen(context, str, hashMap, arrayList);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRealOpen");
    }
}
