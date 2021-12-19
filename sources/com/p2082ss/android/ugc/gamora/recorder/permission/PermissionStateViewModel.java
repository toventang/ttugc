package com.p2082ss.android.ugc.gamora.recorder.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel */
public final class PermissionStateViewModel extends BaseJediViewModel<PermissionState> {
    static {
        Covode.recordClassIndex(97832);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new PermissionState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel$a */
    public static final class C83940a extends AbstractC89220m implements AbstractC89172b<PermissionState, PermissionState> {

        /* renamed from: a */
        public static final C83940a f187386a = new C83940a();

        static {
            Covode.recordClassIndex(97833);
        }

        C83940a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PermissionState invoke(PermissionState permissionState) {
            PermissionState permissionState2 = permissionState;
            C89219l.m154721d(permissionState2, "");
            return PermissionState.copy$default(permissionState2, new C20526p(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel$b */
    public static final class C83941b extends AbstractC89220m implements AbstractC89172b<PermissionState, PermissionState> {

        /* renamed from: a */
        public static final C83941b f187387a = new C83941b();

        static {
            Covode.recordClassIndex(97834);
        }

        C83941b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PermissionState invoke(PermissionState permissionState) {
            PermissionState permissionState2 = permissionState;
            C89219l.m154721d(permissionState2, "");
            return PermissionState.copy$default(permissionState2, null, new C20526p(), 1, null);
        }
    }
}
