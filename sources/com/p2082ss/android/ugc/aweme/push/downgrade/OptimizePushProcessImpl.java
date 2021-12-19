package com.p2082ss.android.ugc.aweme.push.downgrade;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.push.downgrade.notice.MainProcessWsChannelService;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl */
public class OptimizePushProcessImpl implements AbstractC65710a {

    /* renamed from: a */
    public static volatile boolean f148059a;

    /* renamed from: b */
    public static boolean f148060b;

    static {
        Covode.recordClassIndex(77204);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl$StartPushProcessTask */
    public static class StartPushProcessTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(77205);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BACKGROUND;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            if (!C65713d.f148065b.booleanValue() || Build.VERSION.SDK_INT >= 26) {
                C29902a.m60273a().startPushProcess(context);
            } else {
                Intent intent = new Intent("com.ss.android.message.action.PUSH_SERVICE");
                intent.setPackage(context.getPackageName());
                m117614a(context, intent);
            }
            C29902a.m60273a().removeRedBadge(context);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName m117614a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl.StartPushProcessTask.m117614a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }
    }

    /* renamed from: a */
    private static boolean m117612a() {
        if (!C17873f.f42636l || C49907s.m93685a().booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl$a */
    public static class C65709a implements AbstractC88433f<Boolean> {
        static {
            Covode.recordClassIndex(77206);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            if (bool.booleanValue() && !OptimizePushProcessImpl.f148060b) {
                OptimizePushProcessImpl.f148060b = true;
                C65717h.f148070a = true;
                new C58221f.C58224c().mo95703b((AbstractC58264w) new StartPushProcessTask()).mo95706a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.push.downgrade.AbstractC65710a
    /* renamed from: a */
    public final boolean mo104854a(Context context, Intent intent) {
        boolean z;
        ComponentName component;
        MethodCollector.m26663i(13613);
        Log.getStackTraceString(new RuntimeException("Intent:" + intent.toUri(0)));
        if (context == null || (component = intent.getComponent()) == null || !TextUtils.equals(context.getPackageName(), component.getPackageName()) || !TextUtils.equals(component.getClassName(), WsChannelService.class.getName())) {
            if (m117612a() && C65714e.m117626a(context) && !C65717h.m117635c(context)) {
                ComponentName component2 = intent.getComponent();
                if (component2 == null) {
                    z = C65715f.m117630a(context, intent);
                } else if (TextUtils.equals(context.getPackageName(), component2.getPackageName())) {
                    if (!C65715f.f148068a) {
                        synchronized (C65715f.class) {
                            try {
                                if (!C65715f.f148068a) {
                                    C65715f.m117629a(context);
                                    C65715f.f148068a = true;
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(13613);
                                throw th;
                            }
                        }
                    }
                    if (!C65715f.f148069b.isEmpty()) {
                        z = C65715f.f148069b.contains(component2.getClassName());
                    } else {
                        z = C65715f.m117630a(context, intent);
                    }
                }
                if (z) {
                    if (!f148059a) {
                        synchronized (OptimizePushProcessImpl.class) {
                            try {
                                if (!f148059a) {
                                    f148059a = true;
                                    C17873f.m33099g().mo143289d(new C65709a());
                                }
                            } finally {
                                MethodCollector.m26664o(13613);
                            }
                        }
                    }
                    return true;
                }
            }
        } else if (C65718i.f148075a || (m117612a() && C65714e.m117626a(context) && !C65717h.m117635c(context))) {
            C65718i.f148075a = true;
            intent.setComponent(new ComponentName(context, MainProcessWsChannelService.class));
        }
        MethodCollector.m26664o(13613);
        return false;
    }
}
