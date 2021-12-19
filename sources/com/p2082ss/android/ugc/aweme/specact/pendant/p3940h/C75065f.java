package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.f */
public final class C75065f {

    /* renamed from: a */
    public static final C75065f f168718a = new C75065f();

    private C75065f() {
    }

    static {
        Covode.recordClassIndex(87937);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.f$a */
    public static final class C75066a<T> implements Comparator {
        static {
            Covode.recordClassIndex(87938);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(t.getTime(), t2.getTime());
        }
    }

    /* renamed from: a */
    private static boolean m131831a(UgActivityTasks ugActivityTasks, List<C75126k.C75135i> list) {
        if (list == null) {
            return false;
        }
        for (C75126k.C75135i iVar : list) {
            if (C89219l.m154714a((Object) ugActivityTasks.getTaskId(), (Object) iVar.f168943c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static void m131832b(UgActivityTasks ugActivityTasks, List<C75126k.C75135i> list) {
        if (list != null) {
            for (C75126k.C75135i iVar : list) {
                if (C89219l.m154714a((Object) iVar.f168943c, (Object) ugActivityTasks.getTaskId())) {
                    C75126k.C75128b bVar = iVar.f168946f;
                    if (bVar != null && bVar.f168908b > 0) {
                        ugActivityTasks.setTime(Integer.valueOf(bVar.f168908b));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static List<UgActivityTasks> m131830a(List<? extends UgActivityTasks> list, List<C75126k.C75135i> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (UgActivityTasks ugActivityTasks : list) {
                    Integer taskType = ugActivityTasks.getTaskType();
                    if (taskType != null) {
                        if (taskType.intValue() == 1 && C89219l.m154714a((Object) ugActivityTasks.getShow(), (Object) false) && ugActivityTasks.getTime() != null) {
                            String taskId = ugActivityTasks.getTaskId();
                            C89219l.m154716b(taskId, "");
                            if (!C89361p.m154929e((CharSequence) taskId, (CharSequence) "daily_watch")) {
                                if (C89219l.m154714a((Object) ugActivityTasks.getTaskId(), (Object) "tribute_trigger")) {
                                    m131832b(ugActivityTasks, list2);
                                }
                                arrayList.add(ugActivityTasks);
                            } else if (m131831a(ugActivityTasks, list2)) {
                                arrayList.add(ugActivityTasks);
                            }
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    C89070n.m154530a((List) arrayList, (Comparator) new C75066a());
                }
            } catch (C16041a unused) {
            }
        }
        return arrayList;
    }
}
