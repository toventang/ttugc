package com.bytedance.jedi.arch;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.jedi.arch.t */
public final class C20531t {
    static {
        Covode.recordClassIndex(24056);
    }

    /* renamed from: com.bytedance.jedi.arch.t$a */
    static class C20532a implements C1175ad.AbstractC1177b {
        static {
            Covode.recordClassIndex(24057);
        }

        private C20532a() {
        }

        /* synthetic */ C20532a(byte b) {
            this();
        }

        @Override // androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                if (newInstance instanceof JediViewModel) {
                    JediViewModel jediViewModel = (JediViewModel) newInstance;
                    AbstractC20550y a = jediViewModel.f48234j.mo33696a(cls);
                    if (a != null) {
                        a.binding(jediViewModel);
                    }
                    jediViewModel.mo33686a_(C20533u.f48608a);
                }
                return newInstance;
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            }
        }
    }

    /* renamed from: a */
    public static C20530s m38716a(ActivityC0945e eVar) {
        if (eVar.getApplication() != null) {
            return new C20530s(eVar.getViewModelStore(), new C20532a((byte) 0));
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
