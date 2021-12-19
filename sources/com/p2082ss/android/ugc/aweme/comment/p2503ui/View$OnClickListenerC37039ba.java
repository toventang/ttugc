package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36174b;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36180f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ba */
public final /* synthetic */ class View$OnClickListenerC37039ba implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87257a;

    static {
        Covode.recordClassIndex(44393);
    }

    View$OnClickListenerC37039ba(C37157k kVar) {
        this.f87257a = kVar;
    }

    public final void onClick(View view) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        ClickAgent.onClick(view);
        C37157k kVar = this.f87257a;
        if (kVar.f87567I != null) {
            Map<String, Comment> map = kVar.f87567I.f87767b;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashMap hashMap = new HashMap();
            int i5 = 0;
            int i6 = 0;
            for (Map.Entry<String, Comment> entry : map.entrySet()) {
                String key = entry.getKey();
                Comment value = entry.getValue();
                if (value != null) {
                    if (value.getCommentType() == 1) {
                        hashSet3.add(key);
                        i5 = (int) (((long) i5) + value.getReplyCommentTotal() + 1);
                    } else if (value.getCommentType() == 2) {
                        hashMap.put(key, value.getReplyId());
                    }
                    if (value.getUser() != null) {
                        hashSet2.add(value.getUser().getUid());
                    }
                    if (value.getAliasAweme() != null) {
                        i6++;
                    }
                }
            }
            if (hashSet3.size() > 0) {
                hashSet.addAll(hashSet3);
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!hashSet3.contains(entry2.getValue())) {
                    hashSet.add(entry2.getKey());
                    i5++;
                }
            }
            int size = map.size();
            int size2 = hashSet2.size();
            String enterFrom = kVar.f87622b.getEnterFrom();
            C89219l.m154721d(enterFrom, "");
            C39162r.m79460a("comment_batch_management_delete_ck", new C33744d().mo59980a("c_number", size).mo59980a("u_number", size2).mo59980a("video_reply_number", i6).mo59983a("enter_from", enterFrom).f79943a);
            if (C36174b.m73727a().length == 3) {
                i = C36174b.m73727a()[0];
            } else {
                i = 100;
            }
            if (size > i) {
                new C23144b(kVar).mo37635a(kVar.getContext().getResources().getQuantityString(R.plurals.a6, size, Integer.valueOf(size)) + kVar.getContext().getResources().getQuantityString(R.plurals.a7, i, Integer.valueOf(i))).mo37637b();
            } else if (hashSet.size() > 0 && kVar.f87623c != null) {
                C23025b bVar = new C23025b(kVar.getContext());
                kVar.f87567I.f87766a = i5;
                if (size == 1 && i6 == 1) {
                    z = true;
                    i2 = R.string.ali;
                } else {
                    z = false;
                    i2 = R.string.ajj;
                }
                bVar.mo37416a(i2, new C37178r(kVar, hashSet, size, hashSet2, i6));
                bVar.mo37418b(R.string.aji, new C37179s(kVar));
                if (i6 <= 0 || !C36180f.m73734a()) {
                    ((C23023b) C23013a.C23015a.m43405a(kVar.requireContext()).mo37411b(kVar.getActivity().getResources().getQuantityString(R.plurals.a4, size, Integer.valueOf(size))).mo37413d(kVar.getActivity().getResources().getQuantityString(R.plurals.a3, size, Integer.valueOf(size))).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                } else {
                    if (z) {
                        i3 = R.string.alk;
                        i4 = R.string.alj;
                    } else {
                        i3 = R.string.alf;
                        i4 = R.string.ale;
                    }
                    ((C23023b) ((C23023b) C23013a.C23015a.m43405a(kVar.requireContext()).mo37479a(i3)).mo37413d(kVar.getActivity().getResources().getString(i4)).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                }
                String enterFrom2 = kVar.f87622b.getEnterFrom();
                C89219l.m154721d(enterFrom2, "");
                C39162r.m79460a("comment_batch_management_delete_confirm_sw", new C33744d().mo59983a("enter_from", enterFrom2).f79943a);
            }
        }
    }
}
