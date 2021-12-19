package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38158ae;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75398a;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75399b;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80653aa;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a */
public final class C72876a {

    /* renamed from: q */
    public static final String f163521q = "information";

    /* renamed from: r */
    public static final String f163522r = "com.android.information";

    /* renamed from: s */
    public static final String f163523s = "com.apple.quicktime.information";

    /* renamed from: t */
    public static final String f163524t = "com.bytedance.info";

    /* renamed from: u */
    public static final String f163525u = "interaction_stickers";

    /* renamed from: v */
    public static final C72877a f163526v = new C72877a((byte) 0);

    /* renamed from: a */
    public Aweme f163527a;

    /* renamed from: b */
    public DataCenter f163528b;

    /* renamed from: c */
    public AbstractC75398a f163529c;

    /* renamed from: d */
    public AbstractC75401d f163530d;

    /* renamed from: e */
    public C75384i f163531e;

    /* renamed from: f */
    public AbstractC80747i f163532f;

    /* renamed from: g */
    public AbstractC84292h f163533g;

    /* renamed from: h */
    public AbstractC75400c f163534h;

    /* renamed from: i */
    public boolean f163535i = true;

    /* renamed from: j */
    public InteractStickerViewModel f163536j;

    /* renamed from: k */
    public boolean f163537k;

    /* renamed from: l */
    public int f163538l;

    /* renamed from: m */
    public String f163539m = "";

    /* renamed from: n */
    public AbstractC75399b f163540n;

    /* renamed from: o */
    public AbsInteractStickerWidget f163541o;

    /* renamed from: p */
    public final AbstractC72888b f163542p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$a */
    public static final class C72877a {
        static {
            Covode.recordClassIndex(85569);
        }

        private C72877a() {
        }

        public /* synthetic */ C72877a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$d */
    public static final class C72880d extends C27895a<ArrayList<InteractStickerStruct>> {
        static {
            Covode.recordClassIndex(85572);
        }

        C72880d() {
        }
    }

    /* renamed from: c */
    public final void mo115252c() {
        InteractStickerViewModel interactStickerViewModel;
        AbsInteractStickerWidget aI_ = this.f163542p.aI_();
        this.f163541o = aI_;
        if (aI_ != null) {
            aI_.mo115491a(this.f163527a);
        }
        AbsInteractStickerWidget absInteractStickerWidget = this.f163541o;
        if (absInteractStickerWidget != null) {
            interactStickerViewModel = absInteractStickerWidget.mo115493e();
        } else {
            interactStickerViewModel = null;
        }
        this.f163536j = interactStickerViewModel;
        mo115245a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$b */
    public static final class CallableC72878b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C72876a f163543a;

        static {
            Covode.recordClassIndex(85570);
        }

        public CallableC72878b(C72876a aVar) {
            this.f163543a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            C72876a aVar = this.f163543a;
            ArrayList<InteractStickerStruct> b = aVar.mo115250b();
            if (!C13603b.m24435a((Collection) b)) {
                ArrayList arrayList = new ArrayList();
                if (b != null) {
                    for (T t : b) {
                        if (t != null) {
                            str = t.getAttr();
                        } else {
                            str = null;
                        }
                        C89219l.m154716b(str, "");
                        if (!aVar.mo115249a(str)) {
                            arrayList.add(t);
                        }
                    }
                    b.removeAll(arrayList);
                }
            }
            return b;
        }
    }

    static {
        Covode.recordClassIndex(85568);
    }

    /* renamed from: a */
    public final void mo115245a() {
        String str;
        String str2;
        long j;
        VideoReplyStruct videoReplyStruct;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        C75391j jVar = new C75391j();
        jVar.f169460o = this.f163529c;
        jVar.f169459n = this.f163530d;
        jVar.f169461p = this.f163534h;
        jVar.f169462q = this.f163540n;
        jVar.f169463r = this.f163531e;
        jVar.f169448c = C72890c.m128721b(this.f163527a);
        jVar.f169449d = C72890c.m128716a(this.f163527a);
        jVar.f169458m = this.f163535i;
        jVar.f169450e = this.f163537k;
        Aweme aweme = this.f163527a;
        String str3 = null;
        if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd3.getLogExtra();
        }
        jVar.f169453h = str;
        Aweme aweme2 = this.f163527a;
        if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
            str2 = null;
        } else {
            str2 = awemeRawAd2.getPageFrom();
        }
        jVar.f169454i = str2;
        Aweme aweme3 = this.f163527a;
        if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            j = 0;
        } else {
            j = creativeId.longValue();
        }
        jVar.f169455j = j;
        Aweme aweme4 = this.f163527a;
        if (aweme4 == null) {
            C89219l.m154715b();
        }
        jVar.f169456k = C38158ae.m77358a(aweme4);
        Aweme aweme5 = this.f163527a;
        if (aweme5 != null) {
            videoReplyStruct = aweme5.getVideoReplyStruct();
        } else {
            videoReplyStruct = null;
        }
        jVar.f169464s = videoReplyStruct;
        jVar.f169465t = m128704b(this.f163527a);
        Aweme aweme6 = this.f163527a;
        if (aweme6 != null) {
            str3 = aweme6.getRequestId();
        }
        jVar.f169457l = str3;
        jVar.f169452g = this.f163539m;
        C89219l.m154716b(jVar, "");
        jVar.f169451f = this.f163538l;
        if (this.f163541o != null) {
            DataCenter dataCenter = this.f163528b;
            if (dataCenter != null) {
                dataCenter.mo60191a("interact_sticker_data", jVar);
                return;
            }
            InteractStickerViewModel interactStickerViewModel = this.f163536j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo115496a("interact_sticker_data", jVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ArrayList<InteractStickerStruct> mo115250b() {
        String str;
        String str2;
        AbstractC80747i iVar = this.f163532f;
        ArrayList<InteractStickerStruct> arrayList = null;
        if (iVar != null) {
            str = iVar.mo123952b(f163521q);
            if (str == null) {
                AbstractC80747i iVar2 = this.f163532f;
                if (iVar2 == null) {
                    C89219l.m154715b();
                }
                str = iVar2.mo123952b(f163522r);
            }
            if (str == null) {
                AbstractC80747i iVar3 = this.f163532f;
                if (iVar3 == null) {
                    C89219l.m154715b();
                }
                str = iVar3.mo123952b(f163523s);
            }
        } else {
            AbstractC84292h hVar = this.f163533g;
            if (hVar != null) {
                str = C80653aa.m139873a(hVar, f163521q);
                if (str == null) {
                    str = C80653aa.m139873a(this.f163533g, f163522r);
                }
                if (str == null) {
                    str = C80653aa.m139873a(this.f163533g, f163523s);
                }
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str2 = new JSONObject(new JSONObject(str).getString(f163524t)).getString(f163525u);
        } catch (Exception e) {
            e.printStackTrace();
            str2 = null;
        }
        try {
            arrayList = (ArrayList) GsonHolder.m138943c().mo123620b().mo46671a(str2, new C72880d().type);
            return arrayList;
        } catch (C28027t e2) {
            e2.printStackTrace();
            return arrayList;
        }
    }

    public C72876a(AbstractC72888b bVar) {
        C89219l.m154721d(bVar, "");
        this.f163542p = bVar;
    }

    /* renamed from: a */
    public final void mo115247a(Aweme aweme) {
        this.f163527a = aweme;
        AbsInteractStickerWidget absInteractStickerWidget = this.f163541o;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.mo115491a(aweme);
        }
    }

    /* renamed from: a */
    public final void mo115248a(ArrayList<InteractStickerStruct> arrayList) {
        DataCenter dataCenter = this.f163528b;
        if (dataCenter != null) {
            dataCenter.mo60191a("interact_sticker_aweme_data", arrayList);
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.f163536j;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.mo115496a("interact_sticker_aweme_data", arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo115251b(ArrayList<InteractStickerStruct> arrayList) {
        DataCenter dataCenter = this.f163528b;
        if (dataCenter != null) {
            dataCenter.mo60191a("interact_sticker_video_data", arrayList);
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.f163536j;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.mo115496a("interact_sticker_video_data", arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$c */
    public static final class C72879c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C72876a f163544a;

        static {
            Covode.recordClassIndex(85571);
        }

        public C72879c(C72876a aVar) {
            this.f163544a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C72876a aVar = this.f163544a;
            C89219l.m154716b(iVar, "");
            ArrayList<InteractStickerStruct> arrayList = (ArrayList) iVar.mo5545d();
            if (aVar.f163541o != null) {
                aVar.mo115251b(arrayList);
            } else if (!C13603b.m24435a((Collection) arrayList)) {
                aVar.mo115252c();
                aVar.mo115251b(arrayList);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ ClassCastException -> 0x0044 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m128704b(com.p2082ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            java.lang.String r4 = ""
            if (r5 != 0) goto L_0x0005
            return r4
        L_0x0005:
            java.util.List r0 = r5.getTextExtra()
            boolean r0 = com.bytedance.common.utility.collection.C13603b.m24435a(r0)
            if (r0 == 0) goto L_0x0010
            return r4
        L_0x0010:
            java.util.List r0 = r5.getTextExtra()     // Catch:{ ClassCastException -> 0x0044 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ ClassCastException -> 0x0044 }
        L_0x0018:
            boolean r0 = r3.hasNext()     // Catch:{ ClassCastException -> 0x0044 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r2 = r3.next()     // Catch:{ ClassCastException -> 0x0044 }
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.p2082ss.android.ugc.aweme.model.TextExtraStruct) r2     // Catch:{ ClassCastException -> 0x0044 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r4)     // Catch:{ ClassCastException -> 0x0044 }
            int r1 = r2.getSubtype()     // Catch:{ ClassCastException -> 0x0044 }
            r0 = 2
            if (r1 == r0) goto L_0x0035
            int r1 = r2.getSubtype()     // Catch:{ ClassCastException -> 0x0044 }
            r0 = 3
            if (r1 != r0) goto L_0x0018
        L_0x0035:
            java.lang.String r0 = r2.getUserId()     // Catch:{ ClassCastException -> 0x0044 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r2.getUserId()     // Catch:{ ClassCastException -> 0x0044 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)     // Catch:{ ClassCastException -> 0x0044 }
            r4 = r0
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72876a.m128704b(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* renamed from: a */
    public final boolean mo115249a(String str) {
        BusinessExtraData businessExtraData;
        String stickerIDs;
        C89219l.m154721d(str, "");
        List list = null;
        try {
            businessExtraData = (BusinessExtraData) GsonHolder.m138943c().mo123620b().mo46670a(new JSONObject(str).getString("interaction_extra"), BusinessExtraData.class);
        } catch (Exception e) {
            e.printStackTrace();
            businessExtraData = null;
        }
        if (businessExtraData == null) {
            return false;
        }
        Aweme aweme = this.f163527a;
        if (!(aweme == null || (stickerIDs = aweme.getStickerIDs()) == null)) {
            list = C89361p.m154921c(stickerIDs, new String[]{","});
        }
        if (C13603b.m24435a((Collection) list)) {
            return false;
        }
        if (list == null) {
            C89219l.m154715b();
        }
        return list.contains(businessExtraData.getStickerId());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$e */
    public static final class C72881e<T> implements Comparator {
        static {
            Covode.recordClassIndex(85573);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.getIndex()), Integer.valueOf(t2.getIndex()));
        }
    }

    /* renamed from: a */
    public final void mo115246a(int i, int i2) {
        DataCenter dataCenter = this.f163528b;
        if (dataCenter != null) {
            dataCenter.mo60191a("interact_sticker_update_intro_layout_y", C89387v.m154943a(Integer.valueOf(i), Integer.valueOf(i2)));
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.f163536j;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.mo115496a("interact_sticker_update_intro_layout_y", C89387v.m154943a(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}
