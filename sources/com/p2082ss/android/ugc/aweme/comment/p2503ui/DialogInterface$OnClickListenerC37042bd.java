package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36174b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bd */
final /* synthetic */ class DialogInterface$OnClickListenerC37042bd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C37157k f87260a;

    /* renamed from: b */
    private final Map f87261b;

    static {
        Covode.recordClassIndex(44396);
    }

    DialogInterface$OnClickListenerC37042bd(C37157k kVar, Map map) {
        this.f87260a = kVar;
        this.f87261b = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        int i2;
        C37157k kVar = this.f87260a;
        Map<String, Comment> map = this.f87261b;
        dialogInterface.dismiss();
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            String curUserId = C31575b.m65865g().getCurUserId();
            Map<String, Comment> map2 = kVar.f87567I.f87768c;
            map2.clear();
            Iterator<Map.Entry<String, Comment>> it = map.entrySet().iterator();
            int i3 = 0;
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                Comment value = it.next().getValue();
                if (value.getUser() != null) {
                    str = value.getUser().getUid();
                }
                String cid = value.getCid();
                if (!TextUtils.equals(curUserId, str)) {
                    arrayList.add(cid);
                    arrayList2.add(str);
                    hashSet.add(str);
                    map2.put(cid, value);
                }
                if (value.getAliasAweme() != null) {
                    i3++;
                }
            }
            if (map2.size() == 0) {
                new C23144b(kVar).mo37635a(kVar.getString(R.string.aju)).mo37637b();
                return;
            }
            int size = arrayList.size();
            int size2 = hashSet.size();
            String enterFrom = kVar.f87622b.getEnterFrom();
            C89219l.m154721d(enterFrom, str);
            C39162r.m79460a("comment_batch_management_report_ck", new C33744d().mo59980a("c_number", size).mo59980a("u_number", size2).mo59980a("video_reply_number", i3).mo59983a("enter_from", enterFrom).f79943a);
            if (C36174b.m73727a().length == 3) {
                i2 = C36174b.m73727a()[1];
            } else {
                i2 = 100;
            }
            if (size > i2) {
                new C23144b(kVar).mo37635a(kVar.getContext().getResources().getQuantityString(R.plurals.a6, size, Integer.valueOf(size)) + kVar.getContext().getResources().getQuantityString(R.plurals.a7, i2, Integer.valueOf(i2))).mo37637b();
            } else if (size > 0) {
                HashSet hashSet2 = new HashSet();
                HashMap hashMap = new HashMap();
                int i4 = 0;
                for (Map.Entry<String, Comment> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    Comment value2 = entry.getValue();
                    if (value2 != null) {
                        if (value2.getCommentType() == 1) {
                            hashSet2.add(key);
                            i4 = (int) (((long) i4) + value2.getReplyCommentTotal() + 1);
                        } else if (value2.getCommentType() == 2) {
                            hashMap.put(key, value2.getReplyId());
                        }
                    }
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    if (!hashSet2.contains(entry2.getValue())) {
                        i4++;
                    }
                }
                kVar.f87567I.f87766a = i4;
                C23025b bVar = new C23025b(kVar.getContext());
                bVar.mo37416a(R.string.ajv, new C37174n(kVar, arrayList, arrayList2, size, hashSet, i3));
                bVar.mo37418b(R.string.aji, C37175o.f87677a);
                ((C23023b) C23013a.C23015a.m43405a(kVar.requireContext()).mo37411b(kVar.getActivity().getResources().getQuantityString(R.plurals.a_, size, Integer.valueOf(size))).mo37413d(kVar.getActivity().getResources().getQuantityString(R.plurals.a9, size, Integer.valueOf(size))).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                C39162r.onEventV3("comment_batch_management_report_confirm_sw");
            }
        } else {
            kVar.mo64701a(map);
        }
    }
}
