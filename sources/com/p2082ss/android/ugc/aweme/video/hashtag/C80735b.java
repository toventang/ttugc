package com.p2082ss.android.ugc.aweme.video.hashtag;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C71852g;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.b */
public final class C80735b {

    /* renamed from: a */
    public AVChallenge f180510a;

    /* renamed from: b */
    public int f180511b;

    /* renamed from: c */
    public int f180512c;

    /* renamed from: d */
    public boolean f180513d;

    /* renamed from: e */
    public AbstractC80736a f180514e;

    /* renamed from: f */
    public String f180515f;

    /* renamed from: g */
    public boolean f180516g;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.b$a */
    public interface AbstractC80736a {
        static {
            Covode.recordClassIndex(94024);
        }

        /* renamed from: a */
        void mo62517a(Context context, int i);

        /* renamed from: b */
        void mo62518b(Context context, int i);
    }

    static {
        Covode.recordClassIndex(94023);
    }

    /* renamed from: a */
    public static C80735b m139992a(C71852g gVar, boolean z) {
        C80735b bVar = new C80735b();
        bVar.f180515f = "search";
        if (z) {
            bVar.f180511b = 3;
        } else {
            bVar.f180511b = 2;
        }
        bVar.f180510a = gVar.f161024a;
        bVar.f180516g = gVar.f161026c;
        return bVar;
    }
}
