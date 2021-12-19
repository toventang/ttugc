package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.cc */
public class C89581cc extends JobSupport implements AbstractC89703z {

    /* renamed from: a */
    private final boolean f203311a;

    static {
        Covode.recordClassIndex(105672);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean cO_() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean cP_() {
        return this.f203311a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89581cc(AbstractC89568bz bzVar) {
        super(true);
        JobSupport jobSupport;
        boolean z = true;
        mo143987a(bzVar);
        AbstractC89677s sVar = (AbstractC89677s) this._parentHandle;
        C89694t tVar = (C89694t) (!(sVar instanceof C89694t) ? null : sVar);
        if (tVar != null && (jobSupport = (JobSupport) tVar.f203312c) != null) {
            while (true) {
                if (!jobSupport.cP_()) {
                    AbstractC89677s sVar2 = (AbstractC89677s) jobSupport._parentHandle;
                    C89694t tVar2 = (C89694t) (!(sVar2 instanceof C89694t) ? null : sVar2);
                    if (tVar2 != null) {
                        jobSupport = (JobSupport) tVar2.f203312c;
                        if (jobSupport == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.f203311a = z;
    }
}
