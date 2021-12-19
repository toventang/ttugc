package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63055a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.model.s */
public final class C84221s {

    /* renamed from: a */
    public int f188215a;

    /* renamed from: b */
    public Object f188216b;

    /* renamed from: c */
    public int f188217c;

    /* renamed from: d */
    public int f188218d;

    /* renamed from: e */
    public float f188219e;

    /* renamed from: f */
    public float f188220f;

    /* renamed from: g */
    public String f188221g;

    /* renamed from: h */
    public boolean f188222h;

    static {
        Covode.recordClassIndex(98128);
    }

    public final String toString() {
        return "ProcessAudioUrlData{mediaType=" + this.f188215a + ", url=" + this.f188216b + ", bitRate=" + this.f188217c + ", infoId=" + this.f188218d + ", loudness='" + this.f188219e + '\'' + ", peak='" + this.f188220f + '\'' + ", fileKey='" + this.f188221g + '\'' + ", forceSoftwareDecode=" + this.f188222h + '}';
    }

    /* renamed from: a */
    public static List<C63055a> m144816a(List<C84221s> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C84221s sVar : list) {
            if (sVar != null) {
                C62960a.m113385a("Ryan1", sVar.toString());
                arrayList.add(new C63055a(sVar.f188215a, sVar.f188216b.toString(), Integer.valueOf(sVar.f188217c), sVar.f188218d, Float.valueOf(sVar.f188219e), Float.valueOf(sVar.f188220f), sVar.f188221g));
            }
        }
        return arrayList;
    }
}
