package com.bytedance.android.livesdk.chatroom;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1192f;
import com.bytedance.android.livesdk.live.model.C9302a;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawerUrlsSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.d */
public class C7411d {

    /* renamed from: e */
    private static C7411d f18372e;

    /* renamed from: a */
    public boolean f18373a;

    /* renamed from: b */
    public C7412a f18374b;

    /* renamed from: c */
    public int f18375c;

    /* renamed from: d */
    public AbstractC1192f f18376d;

    static {
        Covode.recordClassIndex(8178);
    }

    private C7411d() {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.d$a */
    public class C7412a {

        /* renamed from: a */
        public String f18377a;

        /* renamed from: b */
        public String f18378b;

        /* renamed from: c */
        public String f18379c;

        /* renamed from: d */
        public C9302a f18380d;

        /* renamed from: e */
        public String f18381e;

        /* renamed from: f */
        public boolean f18382f;

        /* renamed from: g */
        int f18383g = -1;

        static {
            Covode.recordClassIndex(8179);
        }

        /* renamed from: a */
        public final String mo13616a() {
            C9302a aVar = this.f18380d;
            if (aVar != null) {
                return aVar.f22736d;
            }
            return null;
        }

        /* renamed from: a */
        private static C9302a m15290a(String str) {
            List<C9302a> value = FeedDrawerUrlsSetting.INSTANCE.getValue();
            C9302a aVar = null;
            if (value != null && !TextUtils.isEmpty(str)) {
                for (C9302a aVar2 : value) {
                    if (!(aVar2 == null || aVar2.f22733a == null)) {
                        if (TextUtils.equals(aVar2.f22733a, str)) {
                            return aVar2;
                        }
                        if ((aVar2.f22733a.startsWith("*") && str.endsWith(aVar2.f22733a.replace("*", ""))) || (aVar2.f22733a.endsWith("*") && str.startsWith(aVar2.f22733a.replace("*", "")))) {
                            aVar = aVar2;
                        }
                    }
                }
            }
            return aVar;
        }

        public C7412a(EnterRoomConfig enterRoomConfig) {
            if (enterRoomConfig != null) {
                this.f18378b = enterRoomConfig.f28233c.f28293J;
                this.f18377a = enterRoomConfig.f28233c.f28295L;
                if (!TextUtils.isEmpty(this.f18378b) && !TextUtils.isEmpty(this.f18377a)) {
                    this.f18379c = this.f18378b + "_" + this.f18377a;
                }
                this.f18380d = m15290a(this.f18379c);
                this.f18381e = enterRoomConfig.f28233c.f28299P;
                if (TextUtils.equals(enterRoomConfig.f28233c.f28306W, "small_picture")) {
                    this.f18382f = true;
                } else {
                    this.f18382f = false;
                }
                this.f18383g = enterRoomConfig.f28232b.f28256M;
            }
        }
    }

    /* renamed from: b */
    public final String mo13611b() {
        C7412a aVar;
        if (!this.f18373a || (aVar = this.f18374b) == null) {
            return null;
        }
        return aVar.f18378b;
    }

    /* renamed from: c */
    public final String mo13612c() {
        C7412a aVar;
        if (!this.f18373a || (aVar = this.f18374b) == null) {
            return null;
        }
        return aVar.f18377a;
    }

    /* renamed from: d */
    public final String mo13613d() {
        C7412a aVar;
        if (!this.f18373a || (aVar = this.f18374b) == null) {
            return null;
        }
        return aVar.mo13616a();
    }

    /* renamed from: e */
    public final String mo13614e() {
        C7412a aVar;
        if (!this.f18373a || (aVar = this.f18374b) == null) {
            return null;
        }
        return aVar.f18381e;
    }

    /* renamed from: f */
    public final int mo13615f() {
        C7412a aVar;
        if (!this.f18373a || (aVar = this.f18374b) == null) {
            return -1;
        }
        return aVar.f18383g;
    }

    /* renamed from: a */
    public static C7411d m15284a() {
        MethodCollector.m26663i(10831);
        if (f18372e == null) {
            synchronized (C7411d.class) {
                try {
                    if (f18372e == null) {
                        f18372e = new C7411d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10831);
                    throw th;
                }
            }
        }
        C7411d dVar = f18372e;
        MethodCollector.m26664o(10831);
        return dVar;
    }
}
