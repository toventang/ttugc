package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.JediViewModel;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class Factory implements C1175ad.AbstractC1177b {
    static {
        Covode.recordClassIndex(24077);
    }

    static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        static {
            Covode.recordClassIndex(24079);
        }

        /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
        @Override // com.bytedance.jedi.arch.JediViewModel
        /* renamed from: d */
        public final /* synthetic */ SimpleViewHolderState mo23027d() {
            return new SimpleViewHolderState(null, 1, null);
        }
    }

    static final class SimpleViewHolderState implements AbstractC20368af {
        private final C89391z trigger;

        static {
            Covode.recordClassIndex(24078);
        }

        public SimpleViewHolderState() {
            this(null, 1, null);
        }

        private final void component1() {
        }

        public static /* synthetic */ SimpleViewHolderState copy$default(SimpleViewHolderState simpleViewHolderState, C89391z zVar, int i, Object obj) {
            if ((i & 1) != 0) {
                zVar = simpleViewHolderState.trigger;
            }
            return simpleViewHolderState.copy(zVar);
        }

        public final SimpleViewHolderState copy(C89391z zVar) {
            C89219l.m154719c(zVar, "");
            return new SimpleViewHolderState(zVar);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SimpleViewHolderState) && C89219l.m154714a(this.trigger, ((SimpleViewHolderState) obj).trigger);
            }
            return true;
        }

        public final int hashCode() {
            C89391z zVar = this.trigger;
            if (zVar != null) {
                return zVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "SimpleViewHolderState(trigger=" + this.trigger + ")";
        }

        public SimpleViewHolderState(C89391z zVar) {
            C89219l.m154719c(zVar, "");
            this.trigger = zVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SimpleViewHolderState(C89391z zVar, int i, C89214g gVar) {
            this((i & 1) != 0 ? C89391z.f203057a : zVar);
        }
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return new ViewModel();
    }
}
