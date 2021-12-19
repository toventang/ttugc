package com.bytedance.android.livesdk.p442ai.p445c;

import android.content.Context;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p379n.AbstractC5770d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.view.AbstractC11874c;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.ai.c.a */
public final class C6715a implements AbstractC11874c {

    /* renamed from: a */
    public Context f16648a;

    /* renamed from: b */
    public TextureRenderView f16649b;

    /* renamed from: c */
    public AbstractC5777j f16650c;

    /* renamed from: d */
    public AbstractC5770d f16651d;

    /* renamed from: e */
    public int f16652e = 0;

    /* renamed from: f */
    public AbstractC11874c.AbstractC11875a f16653f;

    /* renamed from: g */
    private C88411a f16654g = new C88411a();

    /* renamed from: h */
    private AbstractC11643g.AbstractC11646c f16655h = new AbstractC11643g.AbstractC11646c() {
        /* class com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67161 */

        static {
            Covode.recordClassIndex(7454);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11646c
        /* renamed from: a */
        public final void mo12871a(AbstractC11643g.EnumC11645b bVar, Object obj) {
            if (C6715a.this.f16651d != null && C6715a.this.f16650c != null) {
                switch (C67172.f16657a[bVar.ordinal()]) {
                    case 1:
                        if (C6715a.this.f16653f != null) {
                        }
                        return;
                    case 2:
                        if (C6715a.this.f16652e != 1) {
                            C6715a.this.f16652e = 2;
                        }
                        if (obj == null) {
                            return;
                        }
                        return;
                    case 3:
                        C6715a.this.f16652e = 1;
                        C6715a.this.f16651d.mo11509a(C6715a.this.f16648a);
                        if (C6715a.this.f16653f == null) {
                            return;
                        }
                        return;
                    case 4:
                        if (C6715a.this.f16653f == null) {
                            return;
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        if (C6715a.this.f16653f == null) {
                            return;
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        if (C6715a.this.f16653f == null) {
                            return;
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        try {
                            int parseInt = Integer.parseInt((String) obj);
                            if (parseInt != 0) {
                                int i = 65535 & parseInt;
                                int i2 = parseInt >> 16;
                                if (C6715a.this.f16649b != null) {
                                    C6715a.this.f16649b.setScaleType(2);
                                    C6715a.this.f16649b.mo19014a(i, i2);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            C3854a.m9453a(6, "LivePlayerView", e.toString());
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(7453);
    }

    public final void onEvent(C7400q qVar) {
    }

    /* renamed from: com.bytedance.android.livesdk.ai.c.a$2 */
    static /* synthetic */ class C67172 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16657a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 7455(0x1d1f, float:1.0447E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a = r2
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r2 = com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.f16657a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p442ai.p445c.C6715a.C67172.<clinit>():void");
        }
    }

    public C6715a(Context context) {
        this.f16648a = context;
    }
}
