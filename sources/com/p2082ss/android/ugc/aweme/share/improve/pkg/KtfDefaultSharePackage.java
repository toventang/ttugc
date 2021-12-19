package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.KtfInfo;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage */
public abstract class KtfDefaultSharePackage extends SharePackage {
    static {
        Covode.recordClassIndex(81536);
    }

    /* renamed from: b */
    public abstract Aweme mo109575b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtfDefaultSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage$a */
    public static final class DialogInterface$OnClickListenerC69218a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f154722a;

        /* renamed from: b */
        final /* synthetic */ KtfInfo f154723b;

        /* renamed from: c */
        final /* synthetic */ Aweme f154724c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f154725d;

        static {
            Covode.recordClassIndex(81537);
        }

        DialogInterface$OnClickListenerC69218a(Context context, KtfInfo ktfInfo, Aweme aweme, AbstractC89171a aVar) {
            this.f154722a = context;
            this.f154723b = ktfInfo;
            this.f154724c = aweme;
            this.f154725d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("tns_share_warning_cancel_ktf", new C33744d().mo59983a("object_id", this.f154724c.getAid()).f79943a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage$b */
    public static final class DialogInterface$OnClickListenerC69219b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f154726a;

        /* renamed from: b */
        final /* synthetic */ KtfInfo f154727b;

        /* renamed from: c */
        final /* synthetic */ Aweme f154728c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f154729d;

        static {
            Covode.recordClassIndex(81538);
        }

        DialogInterface$OnClickListenerC69219b(Context context, KtfInfo ktfInfo, Aweme aweme, AbstractC89171a aVar) {
            this.f154726a = context;
            this.f154727b = ktfInfo;
            this.f154728c = aweme;
            this.f154729d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("tns_share_warning_stillshare_ktf", new C33744d().mo59983a("object_id", this.f154728c.getAid()).f79943a);
            AbstractC89171a aVar = this.f154729d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public void mo109570a(Context context, AbstractC69581b bVar, AbstractC89171a<C89391z> aVar) {
        String str;
        String str2;
        C89219l.m154721d(context, "");
        Aweme b = mo109575b();
        if (b != null) {
            if (bVar != null) {
                str = bVar.mo109548a();
            } else {
                str = null;
            }
            if (!TextUtils.equals("download", str)) {
                KtfInfo ktfInfo = b.getUploadMiscInfoStruct().ktfInfo;
                if (ktfInfo != null && ktfInfo.getShowMessageOnShare() && !ktfInfo.getHasShowOnce()) {
                    ktfInfo.setHasShowOnce(true);
                    C17197a.C17200a aVar2 = new C17197a.C17200a(context);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageResource(R.raw.icon_exclamation_mark_triangle_fill);
                    aVar2.mo27191a(imageView, 48, 48);
                    aVar2.f41059E = true;
                    aVar2.f41060F = true;
                    aVar2.f41067M = false;
                    aVar2.mo27189a(R.string.ct5);
                    aVar2.f41072c = ktfInfo.getMessageTextOnShare();
                    aVar2.mo27190a(R.string.ct4, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69218a(context, ktfInfo, b, aVar), false);
                    aVar2.mo27195b(R.string.ct6, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69219b(context, ktfInfo, b, aVar), false);
                    aVar2.mo27193a().mo27185c();
                    if (bVar == null || TextUtils.equals(bVar.mo109548a(), "chat_merge")) {
                        str2 = "send_to";
                    } else {
                        str2 = "share_to";
                    }
                    C39162r.m79460a("tns_share_warning_popout_ktf", new C33744d().mo59983a("object_id", b.getAid()).mo59983a(StringSet.type, str2).f79943a);
                } else if (aVar != null) {
                    aVar.invoke();
                }
            } else if (aVar != null) {
                aVar.invoke();
            }
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
