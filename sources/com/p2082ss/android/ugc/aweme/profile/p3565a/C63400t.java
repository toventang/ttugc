package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.p2082ss.android.ugc.trill.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.t */
public final class C63400t extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(74691);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63400t(View view) {
        super(view);
        C89219l.m154721d(view, "");
        C39162r.m79460a("optimize_profile", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("action_type", "show").mo59983a("optimize_type", "edit_profile").f79943a);
        view.findViewById(R.id.d7i).setOnClickListener(View$OnClickListenerC634011.f143944a);
        C39162r.m79460a("optimize_profile", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("action_type", "show").mo59983a("optimize_type", "find_friends").f79943a);
        view.findViewById(R.id.b6a).setOnClickListener(View$OnClickListenerC634022.f143945a);
        C39162r.m79460a("optimize_profile", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("action_type", "show").mo59983a("optimize_type", "shoot").f79943a);
        view.findViewById(R.id.dzv).setOnClickListener(View$OnClickListenerC634033.f143946a);
    }

    /* renamed from: a */
    public final void mo102021a(PostGuideTasks postGuideTasks) {
        int i;
        MethodCollector.m26663i(8418);
        C89219l.m154721d(postGuideTasks, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Resources resources = view.getResources();
        Matcher matcher = Pattern.compile("\\d/\\d").matcher("");
        ViewGroup viewGroup = null;
        if (!matcher.find()) {
            matcher = null;
        }
        if (matcher != null) {
            C89378p pVar = new C89378p(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end()));
            View findViewById = this.itemView.findViewById(R.id.d_3);
            C89219l.m154716b(findViewById, "");
            SpannableString spannableString = new SpannableString("");
            spannableString.setSpan(new ForegroundColorSpan(resources.getColor(R.color.bx)), ((Number) pVar.getFirst()).intValue(), ((Number) pVar.getSecond()).intValue(), 17);
            ((TextView) findViewById).setText(spannableString);
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.d_3);
            C89219l.m154716b(findViewById2, "");
            ((TextView) findViewById2).setText("");
        }
        View findViewById3 = this.itemView.findViewById(R.id.d_3);
        C89219l.m154716b(findViewById3, "");
        ((TextView) findViewById3).setVisibility(8);
        int i2 = 0;
        C89378p[] pVarArr = {C89387v.m154943a(this.itemView.findViewById(R.id.d7i), Boolean.valueOf(postGuideTasks.isProfileTaskDone)), C89387v.m154943a(this.itemView.findViewById(R.id.b6a), Boolean.valueOf(postGuideTasks.isFollowTaskDone)), C89387v.m154943a(this.itemView.findViewById(R.id.dzv), Boolean.valueOf(postGuideTasks.isShootTaskDone))};
        View view2 = this.itemView;
        if (view2 instanceof ViewGroup) {
            viewGroup = view2;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null) {
            int i3 = 0;
            do {
                C89378p pVar2 = pVarArr[i3];
                viewGroup2.removeView((View) pVar2.getFirst());
                Object first = pVar2.getFirst();
                C89219l.m154716b(first, "");
                View view3 = (View) first;
                boolean booleanValue = ((Boolean) pVar2.getSecond()).booleanValue();
                View findViewById4 = view3.findViewById(R.id.a4c);
                C89219l.m154716b(findViewById4, "");
                int i4 = 4;
                if (booleanValue) {
                    i = 4;
                } else {
                    i = 0;
                }
                findViewById4.setVisibility(i);
                View findViewById5 = view3.findViewById(R.id.anm);
                C89219l.m154716b(findViewById5, "");
                if (booleanValue) {
                    i4 = 0;
                }
                findViewById5.setVisibility(i4);
                i3++;
            } while (i3 < 3);
            int i5 = 0;
            do {
                C89378p pVar3 = pVarArr[i5];
                if (!((Boolean) pVar3.getSecond()).booleanValue()) {
                    viewGroup2.addView((View) pVar3.getFirst());
                }
                i5++;
            } while (i5 < 3);
            do {
                C89378p pVar4 = pVarArr[i2];
                if (((Boolean) pVar4.getSecond()).booleanValue()) {
                    viewGroup2.addView((View) pVar4.getFirst());
                }
                i2++;
            } while (i2 < 3);
        }
        View findViewById6 = this.itemView.findViewById(R.id.b6a).findViewById(R.id.eac);
        C89219l.m154716b(findViewById6, "");
        ((TextView) findViewById6).setText("");
        MethodCollector.m26664o(8418);
    }
}
