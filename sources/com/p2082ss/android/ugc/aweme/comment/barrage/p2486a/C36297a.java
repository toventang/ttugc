package com.p2082ss.android.ugc.aweme.comment.barrage.p2486a;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.C33506b;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36317c;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.C36298b;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.AnchorsFlowLayout;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.a.a */
public final class C36297a implements AbstractC36304d {

    /* renamed from: a */
    public final C36298b f85815a = new C36298b();

    /* renamed from: b */
    private C60202d f85816b;

    /* renamed from: c */
    private String f85817c;

    static {
        Covode.recordClassIndex(43574);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.AbstractC36304d
    /* renamed from: b */
    public final void mo63545b(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
        C89219l.m154721d(commentMultiAnchorTagLayout, "");
        C60202d dVar = this.f85816b;
        if (dVar != null) {
            C89219l.m154721d(dVar, "");
            try {
                Object f = C89070n.m154579f((List) dVar.f137229a);
                AbstractC60201c cVar = (AbstractC60201c) f;
                AbstractC60201c cVar2 = (AbstractC60201c) C89070n.m154583g((List) dVar.f137229a);
                boolean z = true;
                if (cVar2 == null || cVar2.mo97874d() <= 1) {
                    z = false;
                }
                cVar.mo97891b(C33506b.m68654a(dVar, cVar, z));
                C89379q.m157068constructorimpl((AbstractC60201c) f);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            Iterator<T> it = dVar.f137229a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.AbstractC36304d
    /* renamed from: a */
    public final void mo63544a(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
        MethodCollector.m26663i(9560);
        C89219l.m154721d(commentMultiAnchorTagLayout, "");
        C89393b.m154951c(commentMultiAnchorTagLayout);
        C60202d dVar = this.f85816b;
        if (dVar == null) {
            MethodCollector.m26664o(9560);
        } else if (dVar.mo97898g() != 0) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(commentMultiAnchorTagLayout, "");
            AnchorsFlowLayout flowView = commentMultiAnchorTagLayout.getFlowView();
            List<AbstractC60201c> list = dVar.f137229a;
            C36298b.C36299a aVar = new C36298b.C36299a(commentMultiAnchorTagLayout);
            C36298b.C36300b bVar = new C36298b.C36300b(dVar);
            C89219l.m154721d(flowView, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(bVar, "");
            if (list == null || list.isEmpty()) {
                flowView.setVisibility(8);
            } else {
                flowView.setVisibility(0);
            }
            if (C89219l.m154714a(flowView.getTag(), list) || list == null) {
                flowView.setTag(list);
                MethodCollector.m26664o(9560);
                return;
            }
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                View childAt = flowView.getChildAt(i);
                if (childAt == null) {
                    View view = (View) aVar.invoke();
                    flowView.addView(view);
                    bVar.invoke(view, t, Integer.valueOf(i));
                } else {
                    childAt.setVisibility(0);
                    bVar.invoke(childAt, t, Integer.valueOf(i));
                }
                i = i2;
            }
            if (flowView.getChildCount() > list.size()) {
                int childCount = flowView.getChildCount();
                for (int size = list.size(); size < childCount; size++) {
                    View childAt2 = flowView.getChildAt(size);
                    C89219l.m154716b(childAt2, "");
                    childAt2.setVisibility(8);
                }
            }
            MethodCollector.m26664o(9560);
        } else {
            C89393b.m154949a(commentMultiAnchorTagLayout);
            MethodCollector.m26664o(9560);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.AbstractC36304d
    /* renamed from: a */
    public final void mo63543a(C36317c cVar, Activity activity) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(activity, "");
        Aweme aweme = cVar.getAweme();
        String str = cVar.getMobParams().eventType;
        C89219l.m154716b(str, "");
        JSONObject put = new JSONObject().put("request_id", cVar.getMobParams().requestId);
        C89219l.m154716b(put, "");
        C60202d dVar = new C60202d(aweme, activity, str, "comment_anchor", put, null, false);
        this.f85817c = cVar.getAweme().getAid();
        this.f85816b = dVar;
    }
}
