package com.p2082ss.android.ugc.aweme.comment.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.tag.C23316a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36223d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36173a;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36391f;
import com.p2082ss.android.ugc.aweme.comment.util.C37190d;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.util.f */
public final class C37194f {
    static {
        Covode.recordClassIndex(44549);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.f$a */
    public static final class C37195a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Comment f87709a;

        static {
            Covode.recordClassIndex(44550);
        }

        C37195a(Comment comment) {
            this.f87709a = comment;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            AbstractC81915c.m141874a(new C36391f(this.f87709a, "click_button"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.f$b */
    public static final class C37196b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f87710a;

        static {
            Covode.recordClassIndex(44551);
        }

        public C37196b(AbstractC89171a aVar) {
            this.f87710a = aVar;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f87710a.invoke();
        }
    }

    /* renamed from: e */
    private static String m75169e(Comment comment) {
        C89219l.m154721d(comment, "");
        String string = C17867d.m33078a().getResources().getString(R.string.alb);
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: a */
    public static final String m75162a(Comment comment) {
        C89219l.m154721d(comment, "");
        C36223d a = C36223d.m73822a();
        C89219l.m154716b(a, "");
        if (!a.f85543a) {
            return m75166b(comment);
        }
        if (TextUtils.isEmpty(comment.getTimeFormat())) {
            comment.setTimeFormat(m75166b(comment));
        }
        String timeFormat = comment.getTimeFormat();
        C89219l.m154716b(timeFormat, "");
        return timeFormat;
    }

    /* renamed from: b */
    public static final String m75166b(Comment comment) {
        C89219l.m154721d(comment, "");
        if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
            C80187aa.C80188a aVar = C80187aa.f179656s;
            return C80187aa.C80188a.m139006a(((long) comment.getCreateTime()) * 1000);
        }
        Context j = C17873f.m33102j();
        if (j == null) {
            j = C17867d.m33078a();
        }
        String a = C80566ib.m139651a(j, ((long) comment.getCreateTime()) * 1000);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: d */
    private static boolean m75168d(Comment comment) {
        C89219l.m154721d(comment, "");
        if (TextUtils.isEmpty(comment.getReplyToUserName()) || TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0") || comment.getAliasAweme() != null || comment.isTranslated() || C36173a.m73725b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m75164a(C38255s sVar) {
        String replace;
        C89219l.m154721d(sVar, "");
        if (TextUtils.isEmpty(sVar.mTimeDesc)) {
            if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
                C80187aa.C80188a aVar = C80187aa.f179656s;
                replace = new C89350l("(.)").replace(C80187aa.C80188a.m139006a(sVar.getCommentTime() * 1000), "$1⁠");
            } else {
                String a = C80566ib.m139651a(C17867d.m33078a(), sVar.getCommentTime() * 1000);
                C89219l.m154716b(a, "");
                replace = new C89350l("(.)").replace(a, "$1⁠");
            }
            sVar.mTimeDesc = replace;
        }
        String str = sVar.mTimeDesc;
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: c */
    public static final String m75167c(Comment comment) {
        String str = "";
        C89219l.m154721d(comment, str);
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            return text == null ? str : text;
        }
        String string = C17867d.m33078a().getString(R.string.bzz);
        C89219l.m154716b(string, str);
        String text2 = comment.getText();
        if (!(text2 == null || text2.length() == 0)) {
            string = string + " • ";
        }
        StringBuilder append = new StringBuilder().append(string);
        String text3 = comment.getText();
        if (text3 != null) {
            str = text3;
        }
        return append.append(str).toString();
    }

    /* renamed from: a */
    private static C23316a m75161a(Context context) {
        C89219l.m154721d(context, "");
        C23316a aVar = new C23316a(context);
        String string = context.getResources().getString(R.string.al5);
        C89219l.m154716b(string, "");
        aVar.mo37996a(string);
        aVar.mo37995a(Integer.valueOf((int) R.raw.icon_pin_fill));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        aVar.mo37999d(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        aVar.mo37998c(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        aVar.mo37993a();
        aVar.mo38000e(C0643b.m2378c(context, R.color.j));
        aVar.mo37994a(C0643b.m2378c(context, R.color.mc));
        aVar.mo37997b(C0643b.m2378c(context, R.color.c5));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        aVar.f54755b = C89241a.m154730a(TypedValue.applyDimension(1, 5.0f, system3.getDisplayMetrics()));
        return aVar;
    }

    /* renamed from: a */
    public static final String m75163a(Comment comment, boolean z) {
        C89219l.m154721d(comment, "");
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb = new StringBuilder(text);
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = C17867d.m33078a().getString(R.string.bzz);
            C89219l.m154716b(string, "");
            String text2 = comment.getText();
            if (!(text2 == null || text2.length() == 0)) {
                string = string + " • ";
            }
            sb.insert(0, string);
        }
        if (m75168d(comment)) {
            String string2 = C17867d.m33078a().getString(R.string.ala, comment.getReplyToUserName(), "");
            C89219l.m154716b(string2, "");
            sb.insert(0, string2);
        }
        if (comment.getCommentType() == 1 && comment.isAuthorPin()) {
            sb.insert(0, "​");
        }
        if (z) {
            sb.append(" ").append(m75162a(comment));
            if (C36173a.m73724a() && comment.getAliasAweme() == null) {
                sb.append(" ").append(m75169e(comment)).append(" ");
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static final List<TextExtraStruct> m75165a(Comment comment, Context context, boolean z) {
        ArrayList arrayList;
        String str;
        int length;
        String str2;
        int length2;
        String str3;
        String str4;
        int length3;
        C89219l.m154721d(comment, "");
        C89219l.m154721d(context, "");
        if (comment.getTextExtra() != null) {
            arrayList = new ArrayList(comment.getTextExtra().size());
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                TextExtraStruct clone = textExtraStruct.clone();
                C89219l.m154716b(clone, "");
                arrayList.add(clone);
            }
        } else {
            arrayList = new ArrayList();
        }
        String text = comment.getText();
        if (comment.getCommentType() == 1 && comment.isAuthorPin()) {
            text = "​".concat(String.valueOf(text));
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(m75161a(context));
            textExtraStruct2.setStart(0);
            textExtraStruct2.setEnd(1);
            arrayList.add(textExtraStruct2);
        }
        if (!z) {
            TextExtraStruct textExtraStruct3 = new TextExtraStruct();
            textExtraStruct3.setType(65281);
            int color = C17867d.m33078a().getResources().getColor(R.color.c2);
            if (!C36173a.m73724a() || comment.getAliasAweme() != null) {
                String a = m75162a(comment);
                if (text == null) {
                    str = "";
                } else {
                    str = text;
                }
                length = str.length() + 1;
                if (text == null) {
                    str2 = "";
                } else {
                    str2 = text;
                }
                length2 = str2.length() + a.length() + 1;
                textExtraStruct3.setCustomSpan(new C37190d.C37191a(C34728n.m70949c(13.0d), color));
            } else {
                String str5 = m75162a(comment) + " " + m75169e(comment) + " ";
                if (text == null) {
                    str3 = "";
                } else {
                    str3 = text;
                }
                length = str3.length() + 1;
                if (text == null) {
                    str4 = "";
                } else {
                    str4 = text;
                }
                length2 = str4.length() + str5.length() + 1;
                if (C80471gb.m139482a()) {
                    length3 = 0;
                } else {
                    length3 = m75162a(comment).length();
                }
                textExtraStruct3.setCustomSpan(new C37190d.C37192b(C34728n.m70949c(13.0d), color, C17301b.m32033a().mo27611a(C17303d.f41573g), length3, m75169e(comment).length() + 1));
                TextExtraStruct textExtraStruct4 = new TextExtraStruct();
                textExtraStruct4.setType(65281);
                textExtraStruct4.setCustomSpan(new C37195a(comment));
                textExtraStruct4.setStart(length);
                textExtraStruct4.setEnd(length2);
                arrayList.add(textExtraStruct4);
            }
            textExtraStruct3.setStart(length);
            textExtraStruct3.setEnd(length2);
            arrayList.add(textExtraStruct3);
        }
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = C17867d.m33078a().getString(R.string.bzz);
            C89219l.m154716b(string, "");
            if (!(text == null || text.length() == 0)) {
                string = string + " • ";
            }
            int length4 = string.length();
            for (TextExtraStruct textExtraStruct5 : arrayList) {
                textExtraStruct5.setStart(textExtraStruct5.getStart() + length4);
                textExtraStruct5.setEnd(textExtraStruct5.getEnd() + length4);
                textExtraStruct5.setUserId(textExtraStruct5.getUserId());
            }
        }
        if (m75168d(comment)) {
            String string2 = C17867d.m33078a().getString(R.string.ala, comment.getReplyToUserName(), "");
            C89219l.m154716b(string2, "");
            int length5 = string2.length();
            for (TextExtraStruct textExtraStruct6 : arrayList) {
                textExtraStruct6.setStart(textExtraStruct6.getStart() + length5);
                textExtraStruct6.setEnd(textExtraStruct6.getEnd() + length5);
            }
            TextExtraStruct textExtraStruct7 = new TextExtraStruct();
            textExtraStruct7.setType(65282);
            textExtraStruct7.setColor(C17867d.m33078a().getResources().getColor(R.color.bx));
            textExtraStruct7.setBoldText(true);
            String replyToUserName = comment.getReplyToUserName();
            C89219l.m154716b(replyToUserName, "");
            int a2 = C89361p.m154888a((CharSequence) string2, replyToUserName, 0, false, 6);
            textExtraStruct7.setStart(a2);
            textExtraStruct7.setUserId(comment.getReplyToUserId());
            textExtraStruct7.setEnd(a2 + comment.getReplyToUserName().length());
            arrayList.add(textExtraStruct7);
        }
        return arrayList;
    }
}
