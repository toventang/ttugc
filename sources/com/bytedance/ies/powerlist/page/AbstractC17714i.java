package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.i */
public abstract class AbstractC17714i {

    /* renamed from: a */
    public final EnumC17699e f42364a;

    /* renamed from: b */
    public final EnumC17699e f42365b;

    /* renamed from: c */
    public final PowerPageState f42366c;

    static {
        Covode.recordClassIndex(20274);
    }

    /* renamed from: com.bytedance.ies.powerlist.page.i$a */
    public static final class C17715a extends AbstractC17714i {

        /* renamed from: d */
        public final EnumC17699e f42367d;

        /* renamed from: e */
        public final EnumC17699e f42368e;

        static {
            Covode.recordClassIndex(20275);
        }

        public /* synthetic */ C17715a(EnumC17699e eVar) {
            this(eVar, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17715a(EnumC17699e eVar, EnumC17699e eVar2) {
            super(eVar, eVar2, PowerPageState.End, (byte) 0);
            C89219l.m154719c(eVar, "");
            this.f42367d = eVar;
            this.f42368e = eVar2;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.i$c */
    public static final class C17717c extends AbstractC17714i {

        /* renamed from: d */
        public final EnumC17699e f42372d;

        /* renamed from: e */
        public final EnumC17699e f42373e;

        static {
            Covode.recordClassIndex(20277);
        }

        public /* synthetic */ C17717c(EnumC17699e eVar) {
            this(eVar, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17717c(EnumC17699e eVar, EnumC17699e eVar2) {
            super(eVar, eVar2, PowerPageState.Loaded, (byte) 0);
            C89219l.m154719c(eVar, "");
            this.f42372d = eVar;
            this.f42373e = eVar2;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.i$d */
    public static final class C17718d extends AbstractC17714i {

        /* renamed from: d */
        public final EnumC17699e f42374d;

        /* renamed from: e */
        public final EnumC17699e f42375e;

        static {
            Covode.recordClassIndex(20278);
        }

        public /* synthetic */ C17718d(EnumC17699e eVar) {
            this(eVar, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17718d(EnumC17699e eVar, EnumC17699e eVar2) {
            super(eVar, eVar2, PowerPageState.Loading, (byte) 0);
            C89219l.m154719c(eVar, "");
            this.f42374d = eVar;
            this.f42375e = eVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo28189a(EnumC17699e eVar) {
        if (this.f42364a == eVar || eVar == EnumC17699e.Refresh) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.powerlist.page.i$e */
    public static final class C17719e extends AbstractC17714i {

        /* renamed from: d */
        public final EnumC17699e f42376d;

        /* renamed from: e */
        public final EnumC17699e f42377e;

        static {
            Covode.recordClassIndex(20279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C17719e(EnumC17699e eVar) {
            super(eVar, null, PowerPageState.Reset, (byte) 0);
            C89219l.m154719c(eVar, "");
            this.f42376d = eVar;
            this.f42377e = null;
        }

        public /* synthetic */ C17719e(EnumC17699e eVar, byte b) {
            this(eVar);
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.i$b */
    public static final class C17716b extends AbstractC17714i {

        /* renamed from: d */
        public final EnumC17699e f42369d;

        /* renamed from: e */
        public final Exception f42370e;

        /* renamed from: f */
        public final EnumC17699e f42371f;

        static {
            Covode.recordClassIndex(20276);
        }

        public /* synthetic */ C17716b(EnumC17699e eVar, Exception exc) {
            this(eVar, exc, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17716b(EnumC17699e eVar, Exception exc, EnumC17699e eVar2) {
            super(eVar, eVar2, PowerPageState.Error, (byte) 0);
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(exc, "");
            this.f42369d = eVar;
            this.f42370e = exc;
            this.f42371f = eVar2;
        }
    }

    private AbstractC17714i(EnumC17699e eVar, EnumC17699e eVar2, PowerPageState powerPageState) {
        this.f42364a = eVar;
        this.f42365b = eVar2;
        this.f42366c = powerPageState;
    }

    public /* synthetic */ AbstractC17714i(EnumC17699e eVar, EnumC17699e eVar2, PowerPageState powerPageState, byte b) {
        this(eVar, eVar2, powerPageState);
    }
}
