package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2530b.AbstractC37570a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2531a.C37572a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailLinkLayout;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailMissionLayout;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p2082ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.a */
public final class C37583a implements AbstractC37570a {

    /* renamed from: a */
    private CommerceStickerDetailAuthorLayout f88818a;

    /* renamed from: b */
    private CommerceStickerDetailDescLayout f88819b;

    /* renamed from: c */
    private CommerceStickerDetailDisclaimerLayout f88820c;

    /* renamed from: d */
    private CommerceStickerDetailLinkLayout f88821d;

    /* renamed from: e */
    private CommerceStickerDetailMissionLayout f88822e;

    static {
        Covode.recordClassIndex(44991);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2530b.AbstractC37570a
    /* renamed from: a */
    public final void mo65417a(C75441c cVar) {
        boolean z;
        String str;
        ChallengeDisclaimer disclaimer;
        String title;
        ChallengeDisclaimer disclaimer2;
        String content;
        boolean z2;
        C89219l.m154721d(cVar, "");
        CommerceStickerDetailAuthorLayout commerceStickerDetailAuthorLayout = this.f88818a;
        if (commerceStickerDetailAuthorLayout == null || !commerceStickerDetailAuthorLayout.mo65434a(cVar)) {
            z = true;
        } else {
            z = false;
        }
        CommerceStickerDetailDescLayout commerceStickerDetailDescLayout = this.f88819b;
        if (commerceStickerDetailDescLayout != null) {
            C89219l.m154721d(cVar, "");
            String detailDesc = cVar.getDetailDesc();
            if (detailDesc != null) {
                if (detailDesc.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TuxTextView tuxTextView = (TuxTextView) commerceStickerDetailDescLayout.mo65436a(R.id.efv);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(8);
                } else {
                    TuxTextView tuxTextView2 = (TuxTextView) commerceStickerDetailDescLayout.mo65436a(R.id.efv);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                    AbstractC37569a a = C37572a.m75786a();
                    if (a != null) {
                        a.mo65412a(detailDesc, (TextView) commerceStickerDetailDescLayout.mo65436a(R.id.efv), (ViewGroup) commerceStickerDetailDescLayout.mo65436a(R.id.axn), (TextView) commerceStickerDetailDescLayout.mo65436a(R.id.f7w), (ImageView) commerceStickerDetailDescLayout.mo65436a(R.id.brz));
                    }
                }
            }
        }
        CommerceStickerDetailDisclaimerLayout commerceStickerDetailDisclaimerLayout = this.f88820c;
        if (commerceStickerDetailDisclaimerLayout != null) {
            C89219l.m154721d(cVar, "");
            if (!z || (disclaimer = cVar.getDisclaimer()) == null || (title = disclaimer.getTitle()) == null || title.length() <= 0 || (disclaimer2 = cVar.getDisclaimer()) == null || (content = disclaimer2.getContent()) == null || content.length() <= 0) {
                commerceStickerDetailDisclaimerLayout.setVisibility(8);
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) commerceStickerDetailDisclaimerLayout.mo65437a(R.id.aln);
                C89219l.m154716b(tuxTextView3, "");
                ChallengeDisclaimer disclaimer3 = cVar.getDisclaimer();
                C89219l.m154716b(disclaimer3, "");
                tuxTextView3.setText(disclaimer3.getTitle());
                TuxTextView tuxTextView4 = (TuxTextView) commerceStickerDetailDisclaimerLayout.mo65437a(R.id.alm);
                C89219l.m154716b(tuxTextView4, "");
                ChallengeDisclaimer disclaimer4 = cVar.getDisclaimer();
                C89219l.m154716b(disclaimer4, "");
                tuxTextView4.setText(disclaimer4.getContent());
            }
        }
        CommerceStickerDetailLinkLayout commerceStickerDetailLinkLayout = this.f88821d;
        if (commerceStickerDetailLinkLayout != null) {
            C89219l.m154721d(cVar, "");
            View a2 = commerceStickerDetailLinkLayout.mo65438a(R.id.u7);
            C89219l.m154716b(a2, "");
            a2.setVisibility(0);
            String detailLetters = cVar.getDetailLetters();
            if (TextUtils.isEmpty(detailLetters)) {
                LinearLayout linearLayout = (LinearLayout) commerceStickerDetailLinkLayout.mo65438a(R.id.c30);
                C89219l.m154716b(linearLayout, "");
                linearLayout.setVisibility(8);
            } else {
                C39162r.m79460a("show_link", new C33744d().mo59983a("enter_from", "prop_page").mo59983a(StringSet.type, "web_link").mo59983a("prop_id", cVar.getId()).f79943a);
                LinearLayout linearLayout2 = (LinearLayout) commerceStickerDetailLinkLayout.mo65438a(R.id.c30);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(0);
                TuxTextView tuxTextView5 = (TuxTextView) commerceStickerDetailLinkLayout.mo65438a(R.id.efw);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setText(detailLetters);
                if (commerceStickerDetailLinkLayout.mo65438a(R.id.efw) instanceof TuxTextView) {
                    ((TuxTextView) commerceStickerDetailLinkLayout.mo65438a(R.id.efw)).setTuxFont(72);
                }
                ((TuxTextView) commerceStickerDetailLinkLayout.mo65438a(R.id.efw)).setOnClickListener(new CommerceStickerDetailLinkLayout.View$OnClickListenerC37581a(commerceStickerDetailLinkLayout, cVar));
            }
        }
        CommerceStickerDetailMissionLayout commerceStickerDetailMissionLayout = this.f88822e;
        if (commerceStickerDetailMissionLayout != null) {
            C89219l.m154721d(cVar, "");
            HTCMissionModule htcMissionModule = cVar.getHtcMissionModule();
            String str2 = null;
            if (htcMissionModule != null) {
                str = htcMissionModule.getMissionId();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                commerceStickerDetailMissionLayout.setVisibility(8);
                return;
            }
            commerceStickerDetailMissionLayout.setVisibility(0);
            if (commerceStickerDetailMissionLayout.f88814a == null) {
                commerceStickerDetailMissionLayout.f88814a = new HashMap();
            }
            View view = (View) commerceStickerDetailMissionLayout.f88814a.get(Integer.valueOf((int) R.id.ckg));
            if (view == null) {
                view = commerceStickerDetailMissionLayout.findViewById(R.id.ckg);
                commerceStickerDetailMissionLayout.f88814a.put(Integer.valueOf((int) R.id.ckg), view);
            }
            TuxTextView tuxTextView6 = (TuxTextView) view;
            C89219l.m154716b(tuxTextView6, "");
            HTCMissionModule htcMissionModule2 = cVar.getHtcMissionModule();
            if (htcMissionModule2 != null) {
                str2 = htcMissionModule2.getText();
            }
            tuxTextView6.setText(str2);
            CommerceStickerDetailMissionLayout.m75805a(htcMissionModule, true);
            commerceStickerDetailMissionLayout.setOnClickListener(new CommerceStickerDetailMissionLayout.View$OnClickListenerC37582a(commerceStickerDetailMissionLayout, cVar, htcMissionModule));
        }
    }

    public C37583a(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4, ViewStub viewStub5) {
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(viewStub2, "");
        C89219l.m154721d(viewStub3, "");
        C89219l.m154721d(viewStub4, "");
        C89219l.m154721d(viewStub5, "");
        MethodCollector.m26663i(2794);
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.r1);
            viewStub.setInflatedId(R.id.f7);
            View inflate = viewStub.inflate();
            if (inflate != null) {
                this.f88818a = (CommerceStickerDetailAuthorLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailAuthorLayout");
                MethodCollector.m26664o(2794);
                throw nullPointerException;
            }
        } else {
            this.f88818a = (CommerceStickerDetailAuthorLayout) viewStub.findViewById(R.id.f7);
        }
        if (viewStub2.getParent() != null) {
            viewStub2.setLayoutResource(R.layout.r3);
            viewStub2.setInflatedId(R.id.c7_);
            View inflate2 = viewStub2.inflate();
            if (inflate2 != null) {
                this.f88819b = (CommerceStickerDetailDescLayout) inflate2;
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailDescLayout");
                MethodCollector.m26664o(2794);
                throw nullPointerException2;
            }
        } else {
            this.f88819b = (CommerceStickerDetailDescLayout) viewStub2.findViewById(R.id.c7_);
        }
        if (viewStub3.getParent() != null) {
            viewStub3.setLayoutResource(R.layout.r5);
            viewStub3.setInflatedId(R.id.fhe);
            View inflate3 = viewStub3.inflate();
            if (inflate3 != null) {
                this.f88820c = (CommerceStickerDetailDisclaimerLayout) inflate3;
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailDisclaimerLayout");
                MethodCollector.m26664o(2794);
                throw nullPointerException3;
            }
        } else {
            this.f88820c = (CommerceStickerDetailDisclaimerLayout) viewStub3.findViewById(R.id.fhe);
        }
        if (viewStub4.getParent() != null) {
            viewStub4.setLayoutResource(R.layout.r7);
            viewStub4.setInflatedId(R.id.c4t);
            View inflate4 = viewStub4.inflate();
            if (inflate4 != null) {
                this.f88821d = (CommerceStickerDetailLinkLayout) inflate4;
            } else {
                NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailLinkLayout");
                MethodCollector.m26664o(2794);
                throw nullPointerException4;
            }
        } else {
            this.f88821d = (CommerceStickerDetailLinkLayout) viewStub4.findViewById(R.id.c4t);
        }
        if (viewStub5.getParent() != null) {
            viewStub5.setLayoutResource(R.layout.r9);
            viewStub5.setInflatedId(R.id.c6u);
            View inflate5 = viewStub5.inflate();
            if (inflate5 != null) {
                this.f88822e = (CommerceStickerDetailMissionLayout) inflate5;
                MethodCollector.m26664o(2794);
                return;
            }
            NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailMissionLayout");
            MethodCollector.m26664o(2794);
            throw nullPointerException5;
        }
        this.f88822e = (CommerceStickerDetailMissionLayout) viewStub5.findViewById(R.id.c6u);
        MethodCollector.m26664o(2794);
    }
}
