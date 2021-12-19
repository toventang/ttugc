package com.p2082ss.android.ugc.aweme.donation.detail;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.donation.C43147e;
import com.p2082ss.android.ugc.aweme.donation.detail.C43142f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.donation.detail.a */
public final class C43115a extends AbstractC39060f<C43147e> {

    /* renamed from: a */
    public final C43116b f100468a;

    static {
        Covode.recordClassIndex(51287);
    }

    public C43115a(C43116b bVar) {
        C89219l.m154721d(bVar, "");
        this.f100468a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.y2, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C43142f(a, this.f100468a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        UrlModel urlModel;
        long currentTimeMillis;
        if ((viewHolder instanceof C43142f) && mo63369e() != null && mo63369e().get(i) != null) {
            C43142f fVar = (C43142f) viewHolder;
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C43147e eVar = (C43147e) obj;
            C89219l.m154721d(eVar, "");
            fVar.f100534f.setText(R.string.baf);
            TextView textView = fVar.f100535g;
            C89219l.m154716b(textView, "");
            textView.setText("•");
            if (eVar.f100546f) {
                ImageView imageView = fVar.f100533e;
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(0);
                TextView textView2 = fVar.f100534f;
                C89219l.m154716b(textView2, "");
                textView2.setVisibility(0);
                TextView textView3 = fVar.f100535g;
                C89219l.m154716b(textView3, "");
                textView3.setVisibility(0);
            } else {
                ImageView imageView2 = fVar.f100533e;
                C89219l.m154716b(imageView2, "");
                imageView2.setVisibility(8);
                TextView textView4 = fVar.f100534f;
                C89219l.m154716b(textView4, "");
                textView4.setVisibility(8);
                TextView textView5 = fVar.f100535g;
                C89219l.m154716b(textView5, "");
                textView5.setVisibility(8);
            }
            if (C89219l.m154714a((Object) eVar.f100545e, (Object) true)) {
                View view = fVar.itemView;
                C89219l.m154716b(view, "");
                String string = view.getContext().getString(R.string.bae);
                C89219l.m154716b(string, "");
                TextView textView6 = fVar.f100530b;
                C89219l.m154716b(textView6, "");
                textView6.setText(string);
                C20766v a = C20761r.m39056a((int) R.drawable.ccg).mo34179a("Donation");
                a.f49092E = fVar.f100529a;
                a.f49115l = R.color.f;
                a.mo34186c();
                fVar.f100529a.setOnClickListener(C43142f.View$OnClickListenerC43144b.f100537a);
                fVar.f100530b.setOnClickListener(C43142f.View$OnClickListenerC43145c.f100538a);
            } else {
                C43142f.View$OnClickListenerC43146d dVar = new C43142f.View$OnClickListenerC43146d(fVar, eVar);
                fVar.f100529a.setOnClickListener(dVar);
                fVar.f100530b.setOnClickListener(dVar);
                String e = C80580in.m139690e(eVar.f100541a);
                TextView textView7 = fVar.f100530b;
                C89219l.m154716b(textView7, "");
                textView7.setText(e);
                User user = eVar.f100541a;
                String str = null;
                if (user != null) {
                    urlModel = user.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                IAccountUserService e2 = AccountService.m65215a().mo57069e();
                C89219l.m154716b(e2, "");
                User curUser = e2.getCurUser();
                if (!(curUser == null || curUser.getUid() == null)) {
                    String uid = curUser.getUid();
                    User user2 = eVar.f100541a;
                    if (user2 != null) {
                        str = user2.getUid();
                    }
                    if (C89219l.m154714a((Object) uid, (Object) str)) {
                        urlModel = curUser.getAvatarThumb();
                    }
                }
                if (!(fVar.f100529a == null || urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0)) {
                    C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel));
                    int[] a3 = C80397em.m139369a(100);
                    if (a3 == null) {
                        C89219l.m154715b();
                    }
                    C20766v b = a2.mo34185b(a3);
                    int i2 = C43142f.f100527i;
                    C20766v a4 = b.mo34176a(i2, i2);
                    a4.f49098K = true;
                    C20766v a5 = a4.mo34179a("Donation");
                    a5.f49115l = R.color.f;
                    a5.f49092E = fVar.f100529a;
                    a5.mo34186c();
                }
            }
            View view2 = fVar.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            C89219l.m154716b(context, "");
            Long l = eVar.f100542b;
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            String a6 = C80566ib.m139651a(context, currentTimeMillis * 1000);
            C89219l.m154716b(a6, "");
            String replace = new C89350l("(.)").replace(a6, "$1⁠");
            String str2 = eVar.f100543c;
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            View view3 = fVar.itemView;
            C89219l.m154716b(view3, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.append(view3.getContext().getString(R.string.bad)).append(' ').append(eVar.f100543c).append(' ').append(replace).toString());
            int a7 = C89361p.m154888a((CharSequence) spannableStringBuilder, str2, 0, false, 6);
            int a8 = C89361p.m154888a((CharSequence) spannableStringBuilder, replace, 0, false, 6);
            View view4 = fVar.itemView;
            C89219l.m154716b(view4, "");
            Context context2 = view4.getContext();
            C89219l.m154716b(context2, "");
            spannableStringBuilder.setSpan(new DonationVH$bind$$inlined$apply$lambda$1(context2.getResources().getColor(R.color.bx), fVar, str2, replace), a7, str2.length() + a7, 34);
            View view5 = fVar.itemView;
            C89219l.m154716b(view5, "");
            Context context3 = view5.getContext();
            C89219l.m154716b(context3, "");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context3.getResources().getColor(R.color.c5)), a8, replace.length() + a8, 34);
            TextView textView8 = fVar.f100531c;
            C89219l.m154716b(textView8, "");
            textView8.setText(spannableStringBuilder);
            String str3 = eVar.f100544d;
            if (str3 == null || str3.length() == 0) {
                TextView textView9 = fVar.f100532d;
                C89219l.m154716b(textView9, "");
                textView9.setText("");
                return;
            }
            TextView textView10 = fVar.f100532d;
            C89219l.m154716b(textView10, "");
            textView10.setText("+ " + eVar.f100544d);
        }
    }
}
