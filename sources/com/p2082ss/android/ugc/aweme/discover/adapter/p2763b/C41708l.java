package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.C41988ah;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41485a;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41527d;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63771aj;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.l */
public final class C41708l {
    static {
        Covode.recordClassIndex(49621);
    }

    /* renamed from: a */
    public static final boolean m83667a(C67679e eVar) {
        C67684i iVar;
        if (eVar == null || (iVar = eVar.f151672g) == null || !iVar.isRichSug()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m83665a(C67679e eVar, String str) {
        String str2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo106741b()) {
            return 1;
        }
        if (eVar.f151673h == 5) {
            return 5;
        }
        if (m83667a(eVar)) {
            if (!C41485a.m83438a(str)) {
                return 2;
            }
            C67684i iVar = eVar.f151672g;
            if (iVar != null) {
                str2 = iVar.getUsername();
            } else {
                str2 = null;
            }
            if (C80538hl.m139614a(str2)) {
                return 4;
            }
            return 2;
        } else if (eVar.f151673h == 3) {
            return 3;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public static final CharSequence m83666a(C67679e eVar, View view, AbstractC41955b bVar) {
        String str = "";
        C89219l.m154721d(eVar, str);
        C89219l.m154721d(view, str);
        C89219l.m154721d(bVar, str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = view.getContext();
        C89219l.m154716b(context, str);
        String str2 = eVar.f151667b;
        if (str2 != null) {
            str = str2;
        }
        List<? extends Position> list = eVar.f151669d;
        if (list == null) {
            list = new ArrayList<>();
        }
        spannableStringBuilder.append((CharSequence) bVar.mo71105a(context, str, list));
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static final CharSequence m83668b(C67679e eVar, View view, AbstractC41955b bVar) {
        String str;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (eVar.f151672g.isVerifiedUser()) {
            spannableStringBuilder.append((CharSequence) " T");
            spannableStringBuilder.setSpan(new C63771aj(view.getContext(), R.drawable.abf), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 33);
        }
        Context context = view.getContext();
        C67684i iVar = eVar.f151672g;
        if (iVar != null) {
            str = iVar.getUserRelationType();
        } else {
            str = null;
        }
        String a = C41988ah.m84050a(context, str);
        if (a.length() > 0 && C41527d.m83467c()) {
            spannableStringBuilder.append((CharSequence) " • ");
            spannableStringBuilder.append((CharSequence) a);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(view.getContext(), R.color.c5)), (spannableStringBuilder.length() - 3) - a.length(), spannableStringBuilder.length(), 33);
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length() - a.length();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(styleSpan, length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) C80284by.m139182a()), length, length2, 18);
        }
        return spannableStringBuilder;
    }
}
