package com.bytedance.android.livesdk.p441ah;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ah.c */
public final class C6684c {

    /* renamed from: g */
    public static final AbstractC89244h f16581g = C89250i.m154773a((AbstractC89171a) C6687c.f16590a);

    /* renamed from: h */
    public static final C6686b f16582h = new C6686b((byte) 0);

    /* renamed from: a */
    public boolean f16583a;

    /* renamed from: b */
    public boolean f16584b;

    /* renamed from: c */
    public boolean f16585c;

    /* renamed from: d */
    public long f16586d;

    /* renamed from: e */
    public boolean f16587e;

    /* renamed from: f */
    public boolean f16588f;

    /* renamed from: com.bytedance.android.livesdk.ah.c$a */
    public enum EnumC6685a {
        LIVE_END,
        BACK_APP,
        BLOCK_USER,
        CLOSE_MINI_WINDOW;

        static {
            Covode.recordClassIndex(7423);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ah.c$b */
    public static final class C6686b {
        static {
            Covode.recordClassIndex(7424);
        }

        /* renamed from: a */
        public static C6684c m14211a() {
            return (C6684c) C6684c.f16581g.getValue();
        }

        private C6686b() {
        }

        public /* synthetic */ C6686b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ah.c$c */
    static final class C6687c extends AbstractC89220m implements AbstractC89171a<C6684c> {

        /* renamed from: a */
        public static final C6687c f16590a = new C6687c();

        static {
            Covode.recordClassIndex(7425);
        }

        C6687c() {
            super(0);
        }

        /* renamed from: com.bytedance.android.livesdk.ah.c$c$a */
        public static final class C6688a implements AbstractC6683b {

            /* renamed from: a */
            public boolean f16591a = true;

            static {
                Covode.recordClassIndex(7426);
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: a */
            public final void mo12824a(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: a */
            public final void mo12825a(Activity activity, Bundle bundle) {
                C89219l.m154721d(activity, "");
                C89219l.m154721d(bundle, "");
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: b */
            public final void mo12827b(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: d */
            public final void mo12829d(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: e */
            public final void mo12830e(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            C6688a() {
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: f */
            public final void mo12831f(Activity activity) {
                C89219l.m154721d(activity, "");
                if (C6686b.m14211a().f16588f) {
                    C6686b.m14211a().mo12832a(EnumC6685a.CLOSE_MINI_WINDOW, "mini_window");
                }
                C6686b.m14211a().f16585c = false;
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: c */
            public final void mo12828c(Activity activity) {
                String str;
                C89219l.m154721d(activity, "");
                if (!C6686b.m14211a().f16587e) {
                    this.f16591a = true;
                    C6684c a = C6686b.m14211a();
                    EnumC6685a aVar = EnumC6685a.BACK_APP;
                    if (C6686b.m14211a().f16588f) {
                        str = "mini_window";
                    } else {
                        str = "voice_only";
                    }
                    a.mo12832a(aVar, str);
                }
            }

            @Override // com.bytedance.android.livesdk.p441ah.AbstractC6683b
            /* renamed from: a */
            public final void mo12826a(Context context, Intent intent) {
                Class<?> cls;
                C89219l.m154721d(intent, "");
                if (!C6686b.m14211a().f16587e) {
                    C6686b.m14211a().f16585c = true;
                    if (context instanceof Activity) {
                        AbstractC2953a a = C6193a.m13435a(IHostApp.class);
                        C89219l.m154716b(a, "");
                        List<Class> liveActivityClass = ((IHostApp) a).getLiveActivityClass();
                        C89219l.m154716b(liveActivityClass, "");
                        Iterator<T> it = liveActivityClass.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (C89219l.m154714a((Object) context.getClass(), (Object) it.next())) {
                                z = true;
                            }
                        }
                        if (C6682a.m14197b()) {
                            if (z && !((Activity) context).isInPictureInPictureMode()) {
                                C6686b.m14211a().f16583a = true;
                            }
                            if (this.f16591a) {
                                this.f16591a = false;
                                C6686b.m14211a().mo12833a("mini_window");
                            }
                        } else if (this.f16591a) {
                            this.f16591a = false;
                            C6686b.m14211a().mo12833a("voice_only");
                        }
                    } else {
                        AbstractC2953a a2 = C6193a.m13435a(IHostApp.class);
                        C89219l.m154716b(a2, "");
                        List<Class> liveActivityClass2 = ((IHostApp) a2).getLiveActivityClass();
                        AbstractC2953a a3 = C6193a.m13435a(IHostApp.class);
                        C89219l.m154716b(a3, "");
                        Activity topActivity = ((IHostApp) a3).getTopActivity();
                        C89219l.m154716b(liveActivityClass2, "");
                        boolean z2 = false;
                        for (T t : liveActivityClass2) {
                            if (topActivity != null) {
                                cls = topActivity.getClass();
                            } else {
                                cls = null;
                            }
                            if (C89219l.m154714a((Object) cls, (Object) t)) {
                                z2 = true;
                            }
                        }
                        if (C6682a.m14197b()) {
                            if (z2) {
                                C89219l.m154716b(topActivity, "");
                                if (!topActivity.isInPictureInPictureMode()) {
                                    C6686b.m14211a().f16583a = true;
                                }
                            }
                            if (this.f16591a) {
                                this.f16591a = false;
                                C6686b.m14211a().mo12833a("mini_window");
                            }
                        } else if (this.f16591a) {
                            this.f16591a = false;
                            C6686b.m14211a().mo12833a("voice_only");
                        }
                    }
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6684c invoke() {
            Context e = C3966y.m9669e();
            C89219l.m154716b(e, "");
            ((IHostApp) C6193a.m13435a(IHostApp.class)).registerLifeCycleCallback(new C6693e(e, new C6688a()));
            return new C6684c();
        }
    }

    static {
        Covode.recordClassIndex(7422);
    }

    /* renamed from: a */
    public final void mo12833a(String str) {
        C89219l.m154721d(str, "");
        if (!this.f16584b) {
            this.f16585c = true;
            this.f16586d = SystemClock.elapsedRealtime();
            C6501b.C6502a.m13948a("livesdk_live_exit_backgroud").mo12639a().mo12651a("backstage_type", str).mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo12832a(EnumC6685a aVar, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        if (this.f16585c) {
            this.f16585c = false;
            C6501b a = C6501b.C6502a.m13948a("livesdk_live_backstage_watch_duration").mo12639a().mo12651a("backstage_type", str);
            String name = aVar.name();
            Locale locale = Locale.US;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            a.mo12651a("end_type", lowerCase).mo12646a("duration", SystemClock.elapsedRealtime() - this.f16586d).mo12655b();
        }
    }
}
