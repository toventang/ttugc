package com.bytedance.android.livesdk.p514d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.d.a */
public final class C8313a {

    /* renamed from: a */
    public static AbstractC8314a f20585a;

    /* renamed from: com.bytedance.android.livesdk.d.a$a */
    public interface AbstractC8314a {
        static {
            Covode.recordClassIndex(9151);
        }

        boolean filter(C9591j jVar);
    }

    static {
        Covode.recordClassIndex(9150);
    }

    /* renamed from: b */
    public static ImageModel m16464b(User user) {
        C9591j a = m16463a(user);
        if (a != null) {
            return a.f23265a;
        }
        return null;
    }

    /* renamed from: a */
    public static C9591j m16463a(User user) {
        if (user == null) {
            return null;
        }
        if (user.getBorders() == null || user.getBorders().isEmpty()) {
            if (!(f20585a == null || user.getBorder() == null || !f20585a.filter(user.getBorder()))) {
                return user.getBorder();
            }
        } else if (f20585a == null) {
            return user.getBorders().get(0);
        } else {
            for (C9591j jVar : user.getBorders()) {
                if (jVar != null && f20585a.filter(jVar)) {
                    return jVar;
                }
            }
        }
        return null;
    }
}
