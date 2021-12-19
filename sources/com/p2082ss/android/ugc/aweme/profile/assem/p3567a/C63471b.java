package com.p2082ss.android.ugc.aweme.profile.assem.p3567a;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.api.AddVideoApi;
import com.p2082ss.android.ugc.aweme.utils.C80397em;

/* renamed from: com.ss.android.ugc.aweme.profile.assem.a.b */
public final class C63471b implements AbstractC12644a<AbstractC63470a> {

    /* renamed from: a */
    public final AbstractC63470a f144078a = new C63472a(this);

    static {
        Covode.recordClassIndex(74778);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC63470a mo20458a() {
        return this.f144078a;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a.b$a */
    public static final class C63472a implements AbstractC63470a {

        /* renamed from: a */
        final /* synthetic */ C63471b f144079a;

        static {
            Covode.recordClassIndex(74779);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63472a(C63471b bVar) {
            this.f144079a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.assem.p3567a.AbstractC63470a
        /* renamed from: a */
        public final Object mo102126a(long j, String str, int i) {
            String str2;
            AddVideoApi addVideoApi = AddVideoApi.f143995a;
            int[] a = C80397em.m139369a(101);
            String str3 = null;
            if (a != null) {
                str2 = String.valueOf(a[0]) + "_" + String.valueOf(a[1]);
            } else {
                str2 = null;
            }
            int[] a2 = C80397em.m139369a(200);
            if (a2 != null) {
                str3 = String.valueOf(a2[0]) + "_" + String.valueOf(a2[1]);
            }
            return addVideoApi.getMyPublishVideos(0, str2, str3, 1, j, str, i);
        }
    }
}
