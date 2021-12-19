package com.bytedance.ies.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.dialog.C18254a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.uikit.dialog.b */
public final class DialogC18267b extends Dialog implements DialogInterface {

    /* renamed from: b */
    public static AbstractC18269b f43609b;

    /* renamed from: a */
    public C18254a f43610a = new C18254a(getContext(), this, getWindow());

    /* renamed from: com.bytedance.ies.uikit.dialog.b$b */
    public interface AbstractC18269b {
        static {
            Covode.recordClassIndex(20929);
        }
    }

    static {
        Covode.recordClassIndex(20927);
    }

    /* renamed from: a */
    static int m33974a(int i) {
        return i == 1 ? R.style.hh : i == 2 ? R.style.hi : i >= 16777216 ? i : R.style.hh;
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.b$a */
    public static class C18268a {

        /* renamed from: a */
        public final C18254a.C18260a f43611a;

        /* renamed from: b */
        private int f43612b;

        static {
            Covode.recordClassIndex(20928);
        }

        /* renamed from: a */
        public final C18268a mo29150a() {
            this.f43611a.f43584o = true;
            return this;
        }

        /* renamed from: c */
        public final DialogC18267b mo29159c() {
            DialogC18267b b = mo29157b();
            b.show();
            return b;
        }

        /* renamed from: b */
        public final DialogC18267b mo29157b() {
            int i;
            ListAdapter simpleCursorAdapter;
            MethodCollector.m26663i(12612);
            DialogC18267b bVar = new DialogC18267b(this.f43611a.f43570a, this.f43612b);
            C18254a.C18260a aVar = this.f43611a;
            C18254a aVar2 = bVar.f43610a;
            if (aVar.f43576g != null) {
                aVar2.f43506C = aVar.f43576g;
            } else {
                if (aVar.f43575f != null) {
                    aVar2.mo29131a(aVar.f43575f);
                }
                if (aVar.f43573d != null) {
                    Drawable drawable = aVar.f43573d;
                    aVar2.f43543y = drawable;
                    aVar2.f43542x = 0;
                    if (aVar2.f43544z != null) {
                        if (drawable != null) {
                            aVar2.f43544z.setImageDrawable(drawable);
                        } else {
                            aVar2.f43544z.setVisibility(8);
                        }
                    }
                }
                if (aVar.f43572c != 0) {
                    aVar2.mo29129a(aVar.f43572c);
                }
                if (aVar.f43574e != 0) {
                    int i2 = aVar.f43574e;
                    TypedValue typedValue = new TypedValue();
                    aVar2.f43519a.getTheme().resolveAttribute(i2, typedValue, true);
                    aVar2.mo29129a(typedValue.resourceId);
                }
            }
            if (aVar.f43577h != null) {
                CharSequence charSequence = aVar.f43577h;
                aVar2.f43523e = charSequence;
                if (aVar2.f43505B != null) {
                    aVar2.f43505B.setText(charSequence);
                }
            }
            if (aVar.f43578i != null) {
                aVar2.mo29130a(-1, aVar.f43578i, aVar.f43579j, null);
            }
            if (aVar.f43580k != null) {
                aVar2.mo29130a(-2, aVar.f43580k, aVar.f43581l, null);
            }
            if (aVar.f43582m != null) {
                aVar2.mo29130a(-3, aVar.f43582m, aVar.f43583n, null);
            }
            if (aVar.f43567K) {
                aVar2.f43507D = true;
            }
            if (!(aVar.f43588s == null && aVar.f43564H == null && aVar.f43589t == null)) {
                RecycleListView recycleListView = (RecycleListView) aVar.f43571b.inflate(aVar2.f43512I, (ViewGroup) null);
                if (!aVar.f43560D) {
                    if (aVar.f43561E) {
                        i = aVar2.f43514K;
                    } else {
                        i = aVar2.f43515L;
                    }
                    if (aVar.f43564H != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(aVar.f43570a, i, aVar.f43564H, new String[]{aVar.f43565I}, new int[]{R.id.efq});
                    } else if (aVar.f43589t != null) {
                        simpleCursorAdapter = aVar.f43589t;
                    } else {
                        simpleCursorAdapter = new C18254a.C18266c(aVar.f43570a, i, aVar.f43588s);
                    }
                } else if (aVar.f43564H == null) {
                    simpleCursorAdapter = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008a: CONSTRUCTOR  (r14v6 'simpleCursorAdapter' android.widget.ListAdapter) = 
                          (r15v0 'aVar' com.bytedance.ies.uikit.dialog.a$a)
                          (wrap: android.content.Context : 0x007c: IGET  (r2v3 android.content.Context) = (r15v0 'aVar' com.bytedance.ies.uikit.dialog.a$a) com.bytedance.ies.uikit.dialog.a.a.a android.content.Context)
                          (wrap: int : 0x007e: IGET  (r1v9 int) = (r5v0 'aVar2' com.bytedance.ies.uikit.dialog.a) com.bytedance.ies.uikit.dialog.a.J int)
                          (wrap: java.lang.CharSequence[] : 0x0080: IGET  (r0v60 java.lang.CharSequence[]) = (r15v0 'aVar' com.bytedance.ies.uikit.dialog.a$a) com.bytedance.ies.uikit.dialog.a.a.s java.lang.CharSequence[])
                          (r11v1 'recycleListView' com.bytedance.ies.uikit.dialog.RecycleListView)
                         call: com.bytedance.ies.uikit.dialog.a.a.1.<init>(com.bytedance.ies.uikit.dialog.a$a, android.content.Context, int, java.lang.CharSequence[], com.bytedance.ies.uikit.dialog.RecycleListView):void type: CONSTRUCTOR in method: com.bytedance.ies.uikit.dialog.b.a.b():com.bytedance.ies.uikit.dialog.b, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.uikit.dialog.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 26 more
                        */
                    /*
                    // Method dump skipped, instructions count: 468
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.DialogC18267b.C18268a.mo29157b():com.bytedance.ies.uikit.dialog.b");
                }

                public C18268a(Context context) {
                    this(context, 0);
                }

                /* renamed from: b */
                public final C18268a mo29156b(CharSequence charSequence) {
                    this.f43611a.f43577h = charSequence;
                    return this;
                }

                /* renamed from: a */
                public final C18268a mo29151a(int i) {
                    C18254a.C18260a aVar = this.f43611a;
                    aVar.f43577h = aVar.f43570a.getText(i);
                    return this;
                }

                /* renamed from: c */
                public final C18268a mo29158c(CharSequence charSequence) {
                    this.f43611a.f43580k = charSequence;
                    this.f43611a.f43581l = null;
                    return this;
                }

                /* renamed from: a */
                public final C18268a mo29153a(CharSequence charSequence) {
                    this.f43611a.f43575f = charSequence;
                    return this;
                }

                public C18268a(Context context, int i) {
                    this.f43611a = new C18254a.C18260a(new ContextThemeWrapper(context, DialogC18267b.m33974a(i)));
                    this.f43612b = i;
                }

                /* renamed from: a */
                public final C18268a mo29152a(int i, DialogInterface.OnClickListener onClickListener) {
                    C18254a.C18260a aVar = this.f43611a;
                    aVar.f43578i = aVar.f43570a.getText(i);
                    this.f43611a.f43579j = onClickListener;
                    return this;
                }

                /* renamed from: a */
                public final C18268a mo29154a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f43611a.f43578i = charSequence;
                    this.f43611a.f43579j = onClickListener;
                    return this;
                }

                /* renamed from: a */
                public final C18268a mo29155a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
                    this.f43611a.f43588s = charSequenceArr;
                    this.f43611a.f43590u = onClickListener;
                    return this;
                }
            }

            @Override // android.app.Dialog
            public final void setTitle(CharSequence charSequence) {
                super.setTitle(charSequence);
                this.f43610a.mo29131a(charSequence);
            }

            /* access modifiers changed from: protected */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0164, code lost:
                if (com.bytedance.ies.uikit.dialog.C18254a.m33969a(r10) == false) goto L_0x0166;
             */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x011c  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x015b  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x015f  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x0186  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x0195  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x01a0  */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x01be  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x01e5  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x01f1  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x0222  */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onCreate(android.os.Bundle r16) {
                /*
                // Method dump skipped, instructions count: 839
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.DialogC18267b.onCreate(android.os.Bundle):void");
            }

            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C18254a aVar = this.f43610a;
                if (aVar.f43541w == null || !aVar.f43541w.executeKeyEvent(keyEvent)) {
                    return super.onKeyDown(i, keyEvent);
                }
                return true;
            }

            public final boolean onKeyUp(int i, KeyEvent keyEvent) {
                C18254a aVar = this.f43610a;
                if (aVar.f43541w == null || !aVar.f43541w.executeKeyEvent(keyEvent)) {
                    return super.onKeyUp(i, keyEvent);
                }
                return true;
            }

            protected DialogC18267b(Context context, int i) {
                super(context, m33974a(i));
                if (f43609b == null) {
                    throw new IllegalArgumentException("NightMode is NUll");
                }
            }
        }
