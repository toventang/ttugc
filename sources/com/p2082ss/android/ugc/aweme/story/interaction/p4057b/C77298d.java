package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.model.C77378a;
import com.p2082ss.android.ugc.aweme.story.model.C77385h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.d */
public final class C77298d {
    static {
        Covode.recordClassIndex(90317);
    }

    /* renamed from: a */
    public static final C77297c m135159a(User user, C77302g gVar) {
        C89219l.m154721d(user, "");
        return new C77297c(user, C89070n.m154516a((Object) 1001), gVar);
    }

    /* renamed from: a */
    public static final C77297c m135160a(C77385h hVar, C77302g gVar) {
        boolean z;
        ArrayList arrayList;
        C89219l.m154721d(hVar, "");
        if (C76660b.m134241a() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C77297c(hVar.getUser(), C89070n.m154516a((Object) 1002), gVar);
        }
        List<C77378a> emojiList = hVar.getEmojiList();
        if (emojiList == null) {
            emojiList = C89086z.INSTANCE;
        }
        if (emojiList.isEmpty()) {
            arrayList = C89070n.m154516a((Object) 1002);
        } else {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) emojiList, 10));
            Iterator<T> it = emojiList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().getEmojiId()));
            }
            arrayList = arrayList2;
        }
        return new C77297c(hVar.getUser(), arrayList, gVar);
    }
}
