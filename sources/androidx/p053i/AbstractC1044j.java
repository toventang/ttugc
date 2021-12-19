package androidx.p053i;

import androidx.p053i.C1002a;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.i.j */
public abstract class AbstractC1044j<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.AbstractC1350a<VH> {

    /* renamed from: a */
    private final C1002a<T> f3667a;

    /* renamed from: b */
    private final C1002a.AbstractC1006a<T> f3668b;

    static {
        Covode.recordClassIndex(1137);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f3667a.mo3697a();
    }

    /* renamed from: a */
    public final AbstractC1036i<T> mo3757a() {
        C1002a<T> aVar = this.f3667a;
        if (aVar.f3558g != null) {
            return aVar.f3558g;
        }
        return aVar.f3557f;
    }

    public AbstractC1044j(C1445j.AbstractC1451e<T> eVar) {
        C10451 r1 = new C1002a.AbstractC1006a<T>() {
            /* class androidx.p053i.AbstractC1044j.C10451 */

            static {
                Covode.recordClassIndex(1138);
            }
        };
        this.f3668b = r1;
        C1002a<T> aVar = new C1002a<>(this, eVar);
        this.f3667a = aVar;
        aVar.f3555d = r1;
    }

    /* renamed from: a */
    public T mo3758a(int i) {
        C1002a<T> aVar = this.f3667a;
        if (aVar.f3557f != null) {
            AbstractC1036i<T> iVar = aVar.f3557f;
            iVar.f3640h = iVar.f3639g.f3674e + i;
            iVar.mo3706a(i);
            iVar.f3644l = Math.min(iVar.f3644l, i);
            iVar.f3645m = Math.max(iVar.f3645m, i);
            iVar.mo3742a(true);
            return aVar.f3557f.get(i);
        } else if (aVar.f3558g != null) {
            return aVar.f3558g.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }

    /* renamed from: a */
    public final void mo3759a(AbstractC1036i<T> iVar) {
        C1002a<T> aVar = this.f3667a;
        if (iVar != null) {
            if (aVar.f3557f == null && aVar.f3558g == null) {
                aVar.f3556e = iVar.mo3709a();
            } else if (iVar.mo3709a() != aVar.f3556e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = aVar.f3559h + 1;
        aVar.f3559h = i;
        if (iVar == aVar.f3557f) {
            return;
        }
        if (iVar == null) {
            int a = aVar.mo3697a();
            if (aVar.f3557f != null) {
                aVar.f3557f.mo3740a(aVar.f3560i);
                aVar.f3557f = null;
            } else if (aVar.f3558g != null) {
                aVar.f3558g = null;
            }
            aVar.f3552a.mo3775b(0, a);
        } else if (aVar.f3557f == null && aVar.f3558g == null) {
            aVar.f3557f = iVar;
            iVar.mo3741a((List) null, aVar.f3560i);
            aVar.f3552a.mo3773a(0, iVar.size());
        } else {
            if (aVar.f3557f != null) {
                aVar.f3557f.mo3740a(aVar.f3560i);
                aVar.f3558g = (AbstractC1036i) aVar.f3557f.mo3746e();
                aVar.f3557f = null;
            }
            if (aVar.f3558g == null || aVar.f3557f != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            aVar.f3553b.f4659b.execute(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0091: INVOKE  
                  (wrap: java.util.concurrent.Executor : 0x008a: IGET  (r0v8 java.util.concurrent.Executor) = 
                  (wrap: androidx.recyclerview.widget.c<T> : 0x0088: IGET  (r0v7 androidx.recyclerview.widget.c<T>) = (r5v0 'aVar' androidx.i.a<T>) androidx.i.a.b androidx.recyclerview.widget.c)
                 androidx.recyclerview.widget.c.b java.util.concurrent.Executor)
                  (wrap: androidx.i.a$2 : 0x008e: CONSTRUCTOR  (r4v0 androidx.i.a$2) = 
                  (r5v0 'aVar' androidx.i.a<T>)
                  (wrap: androidx.i.i<T> : 0x0080: IGET  (r6v0 androidx.i.i<T>) = (r5v0 'aVar' androidx.i.a<T>) androidx.i.a.g androidx.i.i)
                  (wrap: androidx.i.i : 0x0086: CHECK_CAST (r7v1 androidx.i.i) = (androidx.i.i) (wrap: java.util.List<T> : 0x0082: INVOKE  (r7v0 java.util.List<T>) = (r11v0 'iVar' androidx.i.i<T>) type: VIRTUAL call: androidx.i.i.e():java.util.List))
                  (r8v0 'i' int)
                  (r11v0 'iVar' androidx.i.i<T>)
                 call: androidx.i.a.2.<init>(androidx.i.a, androidx.i.i, androidx.i.i, int, androidx.i.i):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: androidx.i.j.a(androidx.i.i<T>):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008e: CONSTRUCTOR  (r4v0 androidx.i.a$2) = 
                  (r5v0 'aVar' androidx.i.a<T>)
                  (wrap: androidx.i.i<T> : 0x0080: IGET  (r6v0 androidx.i.i<T>) = (r5v0 'aVar' androidx.i.a<T>) androidx.i.a.g androidx.i.i)
                  (wrap: androidx.i.i : 0x0086: CHECK_CAST (r7v1 androidx.i.i) = (androidx.i.i) (wrap: java.util.List<T> : 0x0082: INVOKE  (r7v0 java.util.List<T>) = (r11v0 'iVar' androidx.i.i<T>) type: VIRTUAL call: androidx.i.i.e():java.util.List))
                  (r8v0 'i' int)
                  (r11v0 'iVar' androidx.i.i<T>)
                 call: androidx.i.a.2.<init>(androidx.i.a, androidx.i.i, androidx.i.i, int, androidx.i.i):void type: CONSTRUCTOR in method: androidx.i.j.a(androidx.i.i<T>):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 29 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.i.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 35 more
                */
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p053i.AbstractC1044j.mo3759a(androidx.i.i):void");
        }
    }
