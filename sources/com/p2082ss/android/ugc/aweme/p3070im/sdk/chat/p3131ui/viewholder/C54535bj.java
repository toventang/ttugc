package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0778h;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.C23316a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55193c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bj */
public final class C54535bj extends C54538bk {

    /* renamed from: D */
    private C54526bg f124985D;

    /* renamed from: E */
    private String f124986E = "";

    /* renamed from: a */
    View f124987a;

    /* renamed from: b */
    Boolean f124988b;

    static {
        Covode.recordClassIndex(64246);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final AbstractC89172b<Boolean, C89391z> bI_() {
        if (this.f124987a != null) {
            return new C54536a(this);
        }
        return null;
    }

    /* renamed from: i */
    public final void mo91628i() {
        LinearLayout.LayoutParams layoutParams = null;
        this.f124988b = null;
        View view = this.f124987a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = layoutParams2;
            }
            LinearLayout.LayoutParams layoutParams3 = layoutParams;
            if (layoutParams3 != null) {
                view.setVisibility(4);
                C0778h.m2703a(layoutParams3, 0);
                layoutParams3.gravity = 8388613;
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f124814j = (TuxIconView) mo91563a(R.id.e7f);
        this.f124987a = (View) mo91563a(R.id.cd2);
        this.f124985D = new C54526bg(this.f124814j);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bj$a */
    static final class C54536a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54535bj f124989a;

        static {
            Covode.recordClassIndex(64247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54536a(C54535bj bjVar) {
            super(1);
            this.f124989a = bjVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                View view = ((C54538bk) this.f124989a).f124996y;
                if (view != null) {
                    view.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54535bj.C54536a.RunnableC545371 */

                        /* renamed from: a */
                        final /* synthetic */ C54536a f124990a;

                        static {
                            Covode.recordClassIndex(64248);
                        }

                        {
                            this.f124990a = r1;
                        }

                        public final void run() {
                            View view;
                            C54535bj bjVar = this.f124990a.f124989a;
                            View view2 = bjVar.f124987a;
                            if (view2 != null && (view = ((C54538bk) bjVar).f124996y) != null) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                                    layoutParams = null;
                                }
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                if (layoutParams2 != null) {
                                    boolean z = true;
                                    if (!C80471gb.m139483a(view2.getContext()) ? view2.getX() < view.getX() : view2.getWidth() > view.getWidth()) {
                                        z = false;
                                    }
                                    if (bjVar.f124988b == null || !C89219l.m154714a(Boolean.valueOf(z), bjVar.f124988b)) {
                                        bjVar.f124988b = Boolean.valueOf(z);
                                        if (z) {
                                            C0778h.m2703a(layoutParams2, 0);
                                            layoutParams2.gravity = 8388611;
                                        } else {
                                            C0778h.m2703a(layoutParams2, 0);
                                            layoutParams2.gravity = 8388613;
                                        }
                                        view2.setLayoutParams(layoutParams2);
                                        view2.setVisibility(0);
                                    }
                                }
                            }
                        }
                    });
                }
            } else {
                this.f124989a.mo91628i();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124814j.setOnClickListener(onClickListener);
        this.f124824t.mo92194a(this.f124814j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54535bj(View view, EnumC53772b bVar) {
        super(view, bVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk
    /* renamed from: a */
    public final C23316a mo91626a(ReferenceInfo referenceInfo, Context context) {
        BaseContent baseContent;
        C89219l.m154721d(referenceInfo, "");
        C89219l.m154721d(context, "");
        ReferenceInfoHint a = C55193c.m100906a(referenceInfo);
        if (a != null) {
            baseContent = a.getParsedContent();
        } else {
            baseContent = null;
        }
        if (!(baseContent instanceof ShareAwemeContent)) {
            baseContent = null;
        }
        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
        if (shareAwemeContent != null) {
            return C54538bk.C54539a.m100000a(context, shareAwemeContent.getAuthorUsername());
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, TextContent textContent, int i) {
        mo91008a(aiVar, aiVar2, textContent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk
    /* renamed from: a */
    public final void mo91627a(C19538ai aiVar, C19538ai aiVar2, TextContent textContent, int i) {
        C89219l.m154721d(aiVar, "");
        if (this.f124986E.length() == 0 || (!C89219l.m154714a((Object) this.f124986E, (Object) aiVar.getUuid()))) {
            String uuid = aiVar.getUuid();
            C89219l.m154716b(uuid, "");
            this.f124986E = uuid;
            mo91628i();
        }
        super.mo91008a(aiVar, aiVar2, textContent, i);
        C54526bg bgVar = this.f124985D;
        if (bgVar != null) {
            bgVar.mo91621a(this.f124823s);
        }
    }
}
