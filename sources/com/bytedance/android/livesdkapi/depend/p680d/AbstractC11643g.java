package com.bytedance.android.livesdkapi.depend.p680d;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.d.g */
public interface AbstractC11643g {

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.g$c */
    public interface AbstractC11646c {
        static {
            Covode.recordClassIndex(13313);
        }

        /* renamed from: a */
        void mo12871a(EnumC11645b bVar, Object obj);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.g$e */
    public interface AbstractC11649e extends AbstractC11646c {
        static {
            Covode.recordClassIndex(13316);
        }

        /* renamed from: a */
        void mo13641a();

        /* renamed from: b */
        void mo13642b();
    }

    static {
        Covode.recordClassIndex(13310);
    }

    /* renamed from: a */
    void mo12908a(AbstractC11656k kVar);

    /* renamed from: a */
    void mo12909a(C11690a aVar);

    /* renamed from: a */
    void mo12910a(String str, AbstractC11663q qVar);

    /* renamed from: a */
    void mo12911a(String str, AbstractC11876d dVar, int i, C11647d dVar2, AbstractC11646c cVar, String str2);

    /* renamed from: a */
    void mo12912a(String str, String str2, AbstractC11876d dVar, int i, C11647d dVar2, AbstractC11646c cVar);

    /* renamed from: a */
    void mo12914a(boolean z, Context context);

    /* renamed from: b */
    void mo12915b(String str, String str2, AbstractC11876d dVar, int i, C11647d dVar2, AbstractC11646c cVar, String str3);

    /* renamed from: c */
    boolean mo12916c(Context context);

    /* renamed from: d */
    void mo12917d(Context context);

    /* renamed from: e */
    void mo12918e(Context context);

    /* renamed from: f */
    void mo12919f(Context context);

    /* renamed from: f */
    void mo12920f(String str);

    /* renamed from: f */
    void mo12921f(boolean z);

    /* renamed from: g */
    void mo12922g(String str);

    /* renamed from: g */
    boolean mo12924g(Context context);

    /* renamed from: h */
    void mo12925h(boolean z);

    /* renamed from: j */
    void mo12926j();

    /* renamed from: k */
    int mo12927k();

    /* renamed from: l */
    boolean mo12928l();

    /* renamed from: m */
    String mo12929m();

    /* renamed from: n */
    String mo12930n();

    /* renamed from: o */
    View mo12931o();

    /* renamed from: p */
    void mo12932p();

    /* renamed from: q */
    int mo12933q();

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.g$d */
    public static class C11647d {

        /* renamed from: a */
        public final boolean f27783a;

        /* renamed from: b */
        public final boolean f27784b;

        /* renamed from: c */
        public final int f27785c;

        static {
            Covode.recordClassIndex(13314);
        }

        /* renamed from: com.bytedance.android.livesdkapi.depend.d.g$d$a */
        public static class C11648a {

            /* renamed from: a */
            public boolean f27786a;

            /* renamed from: b */
            public boolean f27787b;

            /* renamed from: c */
            public int f27788c;

            static {
                Covode.recordClassIndex(13315);
            }

            /* renamed from: a */
            public final C11647d mo18426a() {
                return new C11647d(this, (byte) 0);
            }
        }

        private C11647d(C11648a aVar) {
            this.f27783a = aVar.f27786a;
            this.f27784b = aVar.f27787b;
            this.f27785c = aVar.f27788c;
        }

        /* synthetic */ C11647d(C11648a aVar, byte b) {
            this(aVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.g$b */
    public enum EnumC11645b {
        UNKNOWN,
        PLAYER_PREPARED,
        COMPLETE_PLAY,
        MEDIA_ERROR,
        DISPLAYED_PLAY,
        STOP_WHEN_PLAYING_OTHER,
        STOP_WHEN_JOIN_INTERACT,
        BUFFERING_START,
        BUFFERING_END,
        INTERACT_SEI,
        VIDEO_SIZE_CHANGED,
        START_SWITCH_RESOLUTION,
        PLAYER_DETACHED,
        RESOLUTION_DEGRADE;

        static {
            Covode.recordClassIndex(13312);
        }

        public static EnumC11645b valueOf(int i) {
            if (i < 0 || i >= values().length) {
                return UNKNOWN;
            }
            return values()[i];
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.g$a */
    public static class C11644a {
        static {
            Covode.recordClassIndex(13311);
        }

        /* renamed from: a */
        public static String m20504a(Context context) {
            if (context == null) {
                return "@";
            }
            return context.toString();
        }
    }
}
