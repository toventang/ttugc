package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.b */
public final class C55843b {

    /* renamed from: a */
    public boolean f127286a;

    /* renamed from: b */
    public long f127287b;

    /* renamed from: c */
    public long f127288c;

    /* renamed from: d */
    public int f127289d;

    /* renamed from: e */
    public int f127290e;

    /* renamed from: f */
    public int f127291f;

    /* renamed from: g */
    public final EnumC55835a f127292g;

    /* renamed from: h */
    public final long f127293h;

    /* renamed from: i */
    public final long f127294i;

    /* renamed from: j */
    private final AbstractC89244h f127295j = C89250i.m154773a((AbstractC89171a) C55844a.f127296a);

    static {
        Covode.recordClassIndex(65633);
    }

    /* renamed from: a */
    public final List<String> mo92703a() {
        return (List) this.f127295j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.b$a */
    static final class C55844a extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        public static final C55844a f127296a = new C55844a();

        static {
            Covode.recordClassIndex(65634);
        }

        C55844a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<String> invoke() {
            return new ArrayList();
        }
    }

    public final String toString() {
        int size = mo92703a().size();
        String str = "[";
        for (int i = 0; i < size; i++) {
            str = str + mo92703a().get(i) + ',';
            if (i == 1) {
                break;
            }
        }
        return "RelationFetchResult{fetchScene=" + this.f127292g + ", initMaxTime=" + this.f127293h + ", initMinTime=" + this.f127294i + ", fullSuccess=" + this.f127286a + ", fetchedMaxTime=" + this.f127287b + ", fetchedMinTime=" + this.f127288c + ", fetchedSize=" + this.f127289d + ", updatedSize=" + this.f127290e + ", fetchTimes=" + this.f127291f + ", logIdList=" + (str + "]") + '}';
    }

    public C55843b(EnumC55835a aVar, long j, long j2) {
        C89219l.m154721d(aVar, "");
        this.f127292g = aVar;
        this.f127293h = j;
        this.f127294i = j2;
    }
}
