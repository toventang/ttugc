package androidx.core.p037h;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89199d;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: androidx.core.h.x */
public final class C0803x {
    static {
        Covode.recordClassIndex(884);
    }

    /* renamed from: androidx.core.h.x$a */
    public static final class C0804a implements AbstractC89306h<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2971a;

        static {
            Covode.recordClassIndex(885);
        }

        @Override // p4600h.p4621l.AbstractC89306h
        /* renamed from: a */
        public final Iterator<View> mo2926a() {
            ViewGroup viewGroup = this.f2971a;
            C89219l.m154719c(viewGroup, "");
            return new C0805b(viewGroup);
        }

        C0804a(ViewGroup viewGroup) {
            this.f2971a = viewGroup;
        }
    }

    /* renamed from: androidx.core.h.x$b */
    public static final class C0805b implements AbstractC89199d, Iterator<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2972a;

        /* renamed from: b */
        private int f2973b;

        static {
            Covode.recordClassIndex(886);
        }

        public final boolean hasNext() {
            if (this.f2973b < this.f2972a.getChildCount()) {
                return true;
            }
            return false;
        }

        public final void remove() {
            ViewGroup viewGroup = this.f2972a;
            int i = this.f2973b - 1;
            this.f2973b = i;
            viewGroup.removeViewAt(i);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ View next() {
            ViewGroup viewGroup = this.f2972a;
            int i = this.f2973b;
            this.f2973b = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        C0805b(ViewGroup viewGroup) {
            this.f2972a = viewGroup;
        }
    }

    /* renamed from: a */
    public static final AbstractC89306h<View> m2810a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        return new C0804a(viewGroup);
    }
}
