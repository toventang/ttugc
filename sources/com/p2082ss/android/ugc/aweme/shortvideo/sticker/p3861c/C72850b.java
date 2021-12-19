package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3861c;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.p2082ss.android.ugc.aweme.donation.IDonationService;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.b */
public final class C72850b extends AbstractC72927a {

    /* renamed from: b */
    public static final C72851a f163465b = new C72851a((byte) 0);

    /* renamed from: a */
    final AbstractC72926g f163466a;

    /* renamed from: g */
    private final AbstractC89244h f163467g = C89250i.m154773a((AbstractC89171a) new C72853c(this));

    static {
        Covode.recordClassIndex(85541);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.b$a */
    public static final class C72851a {
        static {
            Covode.recordClassIndex(85542);
        }

        private C72851a() {
        }

        public /* synthetic */ C72851a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.b$b */
    public static final class C72852b extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(85543);
        }

        C72852b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.b$c */
    static final class C72853c extends AbstractC89220m implements AbstractC89171a<float[]> {

        /* renamed from: a */
        final /* synthetic */ C72850b f163468a;

        static {
            Covode.recordClassIndex(85544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72853c(C72850b bVar) {
            super(0);
            this.f163468a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ float[] invoke() {
            long j;
            C72850b bVar = this.f163468a;
            AbstractC72926g gVar = bVar.f163466a;
            if (gVar != null) {
                j = gVar.mo80204ay();
            } else {
                j = 0;
            }
            List<NormalTrackTimeStamp> a = bVar.mo115231a(j, bVar.f163647e);
            if (a == null || a.isEmpty() || a.get(0) == null) {
                return null;
            }
            NormalTrackTimeStamp normalTrackTimeStamp = a.get(0);
            if (normalTrackTimeStamp == null) {
                C89219l.m154715b();
            }
            RectF a2 = bVar.mo115320a(normalTrackTimeStamp);
            float[] fArr = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
            Matrix matrix = new Matrix();
            NormalTrackTimeStamp normalTrackTimeStamp2 = a.get(0);
            if (normalTrackTimeStamp2 == null) {
                C89219l.m154715b();
            }
            matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
            matrix.mapPoints(fArr);
            return fArr;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128723b(j, interactStickerStruct);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C89219l.m154721d(bVar, "");
        if (!C58001a.m104815a(this.f163646d.mo115223a(), 1200)) {
            AbstractC81915c.m141874a(new C49681i(this.f163646d.hashCode()));
            C33744d dVar = new C33744d();
            C75391j jVar = this.f163648f;
            String str6 = null;
            if (jVar == null || (iVar4 = jVar.f169463r) == null) {
                str = null;
            } else {
                str = iVar4.f169429c;
            }
            C33744d a = dVar.mo59983a("group_id", str);
            C75391j jVar2 = this.f163648f;
            if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
                str2 = null;
            } else {
                str2 = iVar3.f169428b;
            }
            C33744d a2 = a.mo59983a("author_id", str2);
            C75391j jVar3 = this.f163648f;
            if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
                str3 = null;
            } else {
                str3 = iVar2.f169430d;
            }
            C33744d a3 = a2.mo59983a("log_pb", str3);
            C75391j jVar4 = this.f163648f;
            if (jVar4 == null || (iVar = jVar4.f169463r) == null) {
                str4 = null;
            } else {
                str4 = iVar.f169427a;
            }
            C39162r.m79460a("sticker_click", a3.mo59983a("enter_from", str4).mo59983a("sticker_type", "donation").f79943a);
            try {
                GsonProvider c = GsonHolder.m138943c();
                C89219l.m154716b(c, "");
                HashMap hashMap = (HashMap) c.mo123620b().mo46671a(this.f163647e.getAttr(), new C72852b().type);
                if (hashMap != null) {
                    str5 = (String) hashMap.get("donation_url");
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    if (str5 == null) {
                        C89219l.m154715b();
                    }
                    IDonationService b = DonationServiceImpl.m86009b();
                    Context context = this.f163645c;
                    C75391j jVar5 = this.f163648f;
                    if (jVar5 != null) {
                        str6 = jVar5.f169449d;
                    }
                    b.mo73341a(context, str6, str5);
                    return;
                }
                View a4 = this.f163646d.mo115223a();
                if (a4 != null) {
                    new C23144b(a4).mo37635a(this.f163645c.getString(R.string.bai)).mo37637b();
                }
            } catch (C28027t e) {
                C51423a.m95790a((Throwable) e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72850b(Context context, C72848a aVar, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72926g gVar) {
        super(context, aVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163466a = gVar;
    }
}
