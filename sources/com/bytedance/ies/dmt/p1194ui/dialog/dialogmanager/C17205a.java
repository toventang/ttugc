package com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.a */
public final class C17205a implements AbstractC17207b {

    /* renamed from: a */
    private volatile ArrayList<Integer> f41111a;

    /* renamed from: b */
    private volatile ArrayList<Integer> f41112b;

    /* renamed from: c */
    private volatile SparseArray<WeakReference<DialogContext>> f41113c;

    /* renamed from: d */
    private volatile SparseArray<WeakReference<DialogContext>> f41114d;

    /* renamed from: e */
    private int f41115e;

    static {
        Covode.recordClassIndex(19666);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.a$a */
    public static class C17206a {

        /* renamed from: a */
        public static C17205a f41116a = new C17205a((byte) 0);

        static {
            Covode.recordClassIndex(19667);
        }
    }

    private C17205a() {
        this.f41111a = new ArrayList<>();
        this.f41112b = new ArrayList<>();
        this.f41113c = new SparseArray<>();
        this.f41114d = new SparseArray<>();
        this.f41115e = 1;
        m31783a(AbstractC17207b.EnumC17212d.AGE_GATE);
        m31783a(AbstractC17207b.EnumC17212d.POLICY_NOTICE);
    }

    /* renamed from: a */
    private void m31782a() {
        while (this.f41114d != null && this.f41114d.size() > 0) {
            int keyAt = this.f41114d.keyAt(0);
            WeakReference<DialogContext> weakReference = this.f41114d.get(keyAt);
            if (weakReference == null || weakReference.get() == null) {
                this.f41114d.remove(keyAt);
            } else if (this.f41111a.size() != 0 && weakReference.get().f41102d == null) {
                return;
            } else {
                if (weakReference.get().f41100b == null || m31784a(weakReference.get().f41100b.ordinal())) {
                    this.f41114d.remove(keyAt);
                    this.f41113c.put(keyAt, weakReference);
                    weakReference.get().mo27201a();
                    return;
                }
                return;
            }
        }
    }

    /* synthetic */ C17205a(byte b) {
        this();
    }

    /* renamed from: a */
    private boolean m31784a(int i) {
        return this.f41112b.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    private synchronized void m31783a(AbstractC17207b.EnumC17212d dVar) {
        MethodCollector.m26663i(4091);
        if (!this.f41111a.contains(Integer.valueOf(dVar.ordinal()))) {
            this.f41111a.add(Integer.valueOf(dVar.ordinal()));
        }
        MethodCollector.m26664o(4091);
    }

    /* renamed from: a */
    public final synchronized void mo27210a(AbstractC17207b.EnumC17208a aVar) {
        WeakReference<DialogContext> weakReference;
        MethodCollector.m26663i(4110);
        if (this.f41113c.get(aVar.ordinal()) != null) {
            weakReference = this.f41113c.get(aVar.ordinal());
            this.f41113c.remove(aVar.ordinal());
        } else {
            if (this.f41114d.get(aVar.ordinal()) != null) {
                weakReference = this.f41114d.get(aVar.ordinal());
                this.f41114d.remove(aVar.ordinal());
            }
            m31782a();
            MethodCollector.m26664o(4110);
        }
        if (!(weakReference == null || weakReference.get() == null || weakReference.get().f41102d == null)) {
            AbstractC17207b.EnumC17212d dVar = weakReference.get().f41102d;
            if (this.f41111a.contains(Integer.valueOf(dVar.ordinal()))) {
                this.f41111a.remove(Integer.valueOf(dVar.ordinal()));
            }
            if (this.f41113c.size() == 0) {
                m31782a();
            }
            MethodCollector.m26664o(4110);
            return;
        }
        m31782a();
        MethodCollector.m26664o(4110);
    }

    /* renamed from: a */
    public final synchronized void mo27209a(DialogContext dialogContext) {
        MethodCollector.m26663i(4141);
        WeakReference<DialogContext> weakReference = new WeakReference<>(dialogContext);
        if (this.f41111a.size() <= 0 || dialogContext.f41102d != null) {
            if (dialogContext.f41100b != null) {
                int i = -1;
                if (dialogContext.f41100b instanceof AbstractC17207b.EnumC17209b) {
                    i = ((AbstractC17207b.EnumC17209b) dialogContext.f41100b).getValue();
                }
                if (dialogContext.f41100b instanceof AbstractC17207b.EnumC17208a) {
                    i = ((AbstractC17207b.EnumC17208a) dialogContext.f41100b).ordinal();
                }
                if (!this.f41112b.contains(Integer.valueOf(i))) {
                    if (dialogContext.f41105g) {
                        dialogContext.mo27203a(null, 0);
                        this.f41114d.put(dialogContext.f41099a.ordinal(), weakReference);
                    }
                    MethodCollector.m26664o(4141);
                    return;
                }
            }
            dialogContext.f41099a.ordinal();
            for (int i2 = 0; i2 < this.f41113c.size(); i2++) {
                WeakReference<DialogContext> valueAt = this.f41113c.valueAt(i2);
                if (valueAt != null && valueAt.get() == null) {
                    this.f41113c.removeAt(i2);
                }
            }
            if (this.f41114d.size() != 0) {
                WeakReference<DialogContext> valueAt2 = this.f41114d.valueAt(0);
                if (valueAt2.get() != null && dialogContext.f41099a.ordinal() < valueAt2.get().f41099a.ordinal()) {
                    if (dialogContext.f41105g) {
                        dialogContext.mo27203a(null, 0);
                        this.f41114d.put(dialogContext.f41099a.ordinal(), weakReference);
                    }
                    MethodCollector.m26664o(4141);
                    return;
                }
            }
            if (this.f41113c.size() + 1 <= this.f41115e) {
                this.f41113c.put(dialogContext.f41099a.ordinal(), weakReference);
                dialogContext.mo27201a();
                MethodCollector.m26664o(4141);
                return;
            }
            if (dialogContext.f41105g) {
                this.f41114d.put(dialogContext.f41099a.ordinal(), weakReference);
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.f41113c.size(); i3++) {
                    arrayList.add(Integer.valueOf(this.f41113c.keyAt(i3)));
                }
                dialogContext.mo27202a(arrayList);
            }
            MethodCollector.m26664o(4141);
            return;
        }
        if (dialogContext.f41105g) {
            dialogContext.mo27203a(this.f41111a, 0);
            this.f41114d.put(dialogContext.f41099a.ordinal(), weakReference);
        }
        MethodCollector.m26664o(4141);
    }
}
