package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.p4496tt.appbrandimpl.C87421b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.k */
public final class C70080k {

    /* renamed from: a */
    public static final C70080k f156698a = new C70080k();

    private C70080k() {
    }

    static {
        Covode.recordClassIndex(82500);
    }

    /* renamed from: a */
    public static void m123731a(ArrayList<String> arrayList, StringBuilder sb) {
        C89219l.m154721d(sb, "");
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append("#").append(it.next()).append(" ");
            }
        }
    }

    /* renamed from: a */
    public static void m123730a(C71518t tVar, StringBuilder sb, List<AVTextExtraStruct> list) {
        C87421b bVar;
        List<TaskMentionedUser> list2;
        C89219l.m154721d(sb, "");
        C89219l.m154721d(list, "");
        if (!(tVar == null || !(!TextUtils.isEmpty(tVar.getExtra())) || (bVar = (C87421b) C63244g.m114602a().mo73261G().mo46670a(tVar.getExtra(), C87421b.class)) == null)) {
            List<String> list3 = bVar.f198211a;
            if (list3 != null && (!list3.isEmpty())) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    sb.append("#").append((String) it.next()).append(" ");
                }
            }
            String str = bVar.f198212b;
            if (!(str == null || (list2 = bVar.f198215e) == null || !(!list2.isEmpty()))) {
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    StringBuilder sb2 = new StringBuilder("@");
                    C89219l.m154716b(t, "");
                    arrayList.add(sb2.append(t.getNickname()).toString());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                Object[] copyOf = Arrays.copyOf(array, array.length);
                String a = C1764a.m5928a(str, Arrays.copyOf(copyOf, copyOf.length));
                C89219l.m154716b(a, "");
                sb.append(a);
                for (T t2 : list2) {
                    C89219l.m154716b(t2, "");
                    int indexOf = sb.indexOf(t2.getNickname()) - 1;
                    String userId = t2.getUserId();
                    C89219l.m154716b(userId, "");
                    list.add(AVTextExtraStructHelper.createAtStruct(indexOf, indexOf + 1 + t2.getNickname().length(), userId, t2.getSecUid()));
                }
            }
        }
    }
}
