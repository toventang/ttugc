package com.bytedance.android.p149d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.d.c */
public interface AbstractC2719c extends AbstractC2717b {
    static {
        Covode.recordClassIndex(3109);
    }

    void attach(Context context, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar);

    String getPlayerTag();

    void initialize(long j, C2720a aVar);

    boolean isPlaying();

    boolean preCreatedSurface(Context context);

    void release();

    boolean warmUp();

    /* renamed from: com.bytedance.android.d.c$a */
    public static class C2720a {

        /* renamed from: a */
        public Context f8121a;

        /* renamed from: b */
        public String f8122b;

        /* renamed from: c */
        public String f8123c;

        /* renamed from: d */
        public String f8124d;

        /* renamed from: e */
        public String f8125e;

        /* renamed from: f */
        public EnumC11728i f8126f;

        /* renamed from: g */
        public C11738s.C11739a f8127g;

        /* renamed from: h */
        public boolean f8128h = true;

        /* renamed from: i */
        public int f8129i;

        static {
            Covode.recordClassIndex(3110);
        }

        /* renamed from: a */
        public static C2720a m7858a(Context context) {
            return new C2720a(context);
        }

        private C2720a(Context context) {
            this.f8121a = context;
        }

        /* renamed from: a */
        public final C2720a mo7294a(String str) {
            this.f8122b = str;
            if (!TextUtils.isEmpty(str)) {
                this.f8129i = 1;
            }
            return this;
        }

        /* renamed from: b */
        public final C2720a mo7295b(String str) {
            this.f8124d = str;
            if (this.f8129i == 0 && !TextUtils.isEmpty(str)) {
                this.f8129i = 2;
            }
            return this;
        }
    }
}
