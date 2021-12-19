package com.p2082ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.p3071a.C53589a;
import com.p2082ss.android.ugc.aweme.p3070im.p3072b.C53591a;
import com.p2082ss.android.ugc.aweme.p3070im.p3072b.C53597b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56269b;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69115d;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b */
public class DialogC69104b extends DialogC69695i {

    /* renamed from: a */
    public AbstractC56267b f154547a;

    /* renamed from: b */
    private C69115d f154548b;

    /* renamed from: c */
    private final Activity f154549c;

    static {
        Covode.recordClassIndex(81418);
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h, com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i
    public void onCreate(Bundle bundle) {
        AbstractC56267b bVar;
        super.onCreate(bundle);
        boolean a = C53589a.m98814a();
        boolean z = false;
        if (!this.f155600n.f155558j || a || this.f155600n.f155567s) {
            C69115d dVar = this.f154548b;
            if (dVar != null) {
                dVar.f154561b = false;
            }
        } else {
            Activity activity = this.f154549c;
            View findViewById = findViewById(R.id.dyg);
            if (findViewById == null) {
                C89219l.m154715b();
            }
            ViewGroup viewGroup = (ViewGroup) findViewById;
            View findViewById2 = findViewById(R.id.dyb);
            if (findViewById2 == null) {
                C89219l.m154715b();
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById2;
            View findViewById3 = findViewById(R.id.dyd);
            if (findViewById3 == null) {
                C89219l.m154715b();
            }
            C53591a aVar = new C53591a(new C53597b(activity, this, viewGroup, viewGroup2, findViewById3, this.f155600n.f155557i, this.f155600n.f155561m));
            AbstractC56234c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            if (shareService != null) {
                Activity activity2 = this.f154549c;
                View findViewById4 = findViewById(R.id.dyn);
                if (findViewById4 == null) {
                    C89219l.m154715b();
                }
                ViewGroup viewGroup3 = (ViewGroup) findViewById4;
                View findViewById5 = findViewById(R.id.dyc);
                if (findViewById5 == null) {
                    C89219l.m154715b();
                }
                ViewGroup viewGroup4 = (ViewGroup) findViewById5;
                View findViewById6 = findViewById(R.id.dye);
                if (findViewById6 == null) {
                    C89219l.m154715b();
                }
                FrameLayout frameLayout = (FrameLayout) findViewById6;
                SharePackage sharePackage = this.f155600n.f155557i;
                boolean z2 = this instanceof DialogC69122c;
                View findViewById7 = findViewById(R.id.dyj);
                if (findViewById7 == null) {
                    C89219l.m154715b();
                }
                MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById7;
                View findViewById8 = findViewById(R.id.dym);
                if (findViewById8 == null) {
                    C89219l.m154715b();
                }
                bVar = shareService.mo92293a(new C56269b(activity2, sharePackage, viewGroup3, viewGroup4, frameLayout, z2, measureLinearLayout, (TextView) findViewById8), aVar);
            } else {
                bVar = null;
            }
            this.f154547a = bVar;
            C69115d dVar2 = this.f154548b;
            if (dVar2 != null) {
                dVar2.f154560a = bVar;
            }
        }
        Window window = getWindow();
        if (window != null) {
            C80420fc.m139414a(window);
        }
        StringBuilder append = new StringBuilder("config has supportIm: ").append(this.f155600n.f155558j).append(", hideContacts: ").append(this.f155600n.f155567s).append("topView is null: ");
        if (this.f155600n.f155559k == null) {
            z = true;
        }
        C51423a.m95792b("CommonShareDialog", append.append(z).append(", has channels size: ").append(this.f155600n.f155549a).append(", has actions size: ").append(this.f155600n.f155550b).toString());
        C35434c.m72464b("share_panel");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC69104b(Activity activity, C69684e eVar, int i) {
        super(activity, i, eVar);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        this.f154549c = activity;
        List<AbstractC69581b> list = eVar.f155549a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof C69115d) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1 ? false : true) {
            Object obj = arrayList2.get(0);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.channel.ImChannel");
            this.f154548b = (C69115d) obj;
        }
        if (this.f154548b != null && C53589a.m98814a()) {
            List<AbstractC69581b> list2 = eVar.f155549a;
            C69115d dVar = this.f154548b;
            if (dVar == null) {
                C89219l.m154715b();
            }
            list2.remove(dVar);
            this.f154548b = null;
        }
    }
}
