package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import androidx.appcompat.app.AlertController;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.app.c */
public class DialogInterfaceC0216c extends DialogC0240h implements DialogInterface {

    /* renamed from: a */
    final AlertController f644a = new AlertController(getContext(), this, getWindow());

    static {
        Covode.recordClassIndex(250);
    }

    /* renamed from: androidx.appcompat.app.c$a */
    public static class C0217a {

        /* renamed from: a */
        public final AlertController.C0203a f645a;

        /* renamed from: b */
        private final int f646b;

        static {
            Covode.recordClassIndex(251);
        }

        /* renamed from: b */
        public final DialogInterfaceC0216c mo458b() {
            DialogInterfaceC0216c a = mo453a();
            a.show();
            return a;
        }

        /* renamed from: a */
        public final DialogInterfaceC0216c mo453a() {
            int i;
            ListAdapter cVar;
            DialogInterfaceC0216c cVar2 = new DialogInterfaceC0216c(this.f645a.f594a, this.f646b);
            AlertController.C0203a aVar = this.f645a;
            AlertController alertController = cVar2.f644a;
            if (aVar.f600g != null) {
                alertController.f525G = aVar.f600g;
            } else {
                if (aVar.f599f != null) {
                    alertController.mo379a(aVar.f599f);
                }
                if (aVar.f597d != null) {
                    Drawable drawable = aVar.f597d;
                    alertController.f521C = drawable;
                    alertController.f520B = 0;
                    if (alertController.f522D != null) {
                        if (drawable != null) {
                            alertController.f522D.setVisibility(0);
                            alertController.f522D.setImageDrawable(drawable);
                        } else {
                            alertController.f522D.setVisibility(8);
                        }
                    }
                }
                if (aVar.f596c != 0) {
                    alertController.mo377a(aVar.f596c);
                }
                if (aVar.f598e != 0) {
                    int i2 = aVar.f598e;
                    TypedValue typedValue = new TypedValue();
                    alertController.f538a.getTheme().resolveAttribute(i2, typedValue, true);
                    alertController.mo377a(typedValue.resourceId);
                }
            }
            if (aVar.f601h != null) {
                CharSequence charSequence = aVar.f601h;
                alertController.f543f = charSequence;
                if (alertController.f524F != null) {
                    alertController.f524F.setText(charSequence);
                }
            }
            if (!(aVar.f602i == null && aVar.f603j == null)) {
                alertController.mo378a(-1, aVar.f602i, aVar.f604k, null, aVar.f603j);
            }
            if (!(aVar.f605l == null && aVar.f606m == null)) {
                alertController.mo378a(-2, aVar.f605l, aVar.f607n, null, aVar.f606m);
            }
            if (!(aVar.f608o == null && aVar.f609p == null)) {
                alertController.mo378a(-3, aVar.f608o, aVar.f610q, null, aVar.f609p);
            }
            if (!(aVar.f615v == null && aVar.f589K == null && aVar.f616w == null)) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) aVar.f595b.inflate(alertController.f530L, (ViewGroup) null);
                if (!aVar.f585G) {
                    if (aVar.f586H) {
                        i = alertController.f532N;
                    } else {
                        i = alertController.f533O;
                    }
                    if (aVar.f589K != null) {
                        cVar = new SimpleCursorAdapter(aVar.f594a, i, aVar.f589K, new String[]{aVar.f590L}, new int[]{16908308});
                    } else if (aVar.f616w != null) {
                        cVar = aVar.f616w;
                    } else {
                        cVar = new AlertController.C0209c(aVar.f594a, i, aVar.f615v);
                    }
                } else if (aVar.f589K == null) {
                    cVar = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: CONSTRUCTOR  (r11v5 'cVar' android.widget.ListAdapter) = 
                          (r4v0 'aVar' androidx.appcompat.app.AlertController$a)
                          (wrap: android.content.Context : 0x009b: IGET  (r7v3 android.content.Context) = (r4v0 'aVar' androidx.appcompat.app.AlertController$a) androidx.appcompat.app.AlertController.a.a android.content.Context)
                          (wrap: int : 0x009d: IGET  (r1v9 int) = (r14v0 'alertController' androidx.appcompat.app.AlertController) androidx.appcompat.app.AlertController.M int)
                          (wrap: java.lang.CharSequence[] : 0x009f: IGET  (r0v59 java.lang.CharSequence[]) = (r4v0 'aVar' androidx.appcompat.app.AlertController$a) androidx.appcompat.app.AlertController.a.v java.lang.CharSequence[])
                          (r9v2 'recycleListView' androidx.appcompat.app.AlertController$RecycleListView)
                         call: androidx.appcompat.app.AlertController.a.1.<init>(androidx.appcompat.app.AlertController$a, android.content.Context, int, java.lang.CharSequence[], androidx.appcompat.app.AlertController$RecycleListView):void type: CONSTRUCTOR in method: androidx.appcompat.app.c.a.a():androidx.appcompat.app.c, file: classes.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.appcompat.app.AlertController, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 26 more
                        */
                    /*
                    // Method dump skipped, instructions count: 500
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogInterfaceC0216c.C0217a.mo453a():androidx.appcompat.app.c");
                }

                /* renamed from: a */
                public final C0217a mo447a(DialogInterface.OnCancelListener onCancelListener) {
                    this.f645a.f612s = onCancelListener;
                    return this;
                }

                /* renamed from: b */
                public final C0217a mo456b(CharSequence charSequence) {
                    this.f645a.f601h = charSequence;
                    return this;
                }

                public C0217a(Context context) {
                    this(context, DialogInterfaceC0216c.m661a(context, 0));
                }

                /* renamed from: a */
                public final C0217a mo445a(int i) {
                    AlertController.C0203a aVar = this.f645a;
                    aVar.f599f = aVar.f594a.getText(R.string.dgi);
                    return this;
                }

                /* renamed from: b */
                public final C0217a mo454b(int i) {
                    AlertController.C0203a aVar = this.f645a;
                    aVar.f601h = aVar.f594a.getText(i);
                    return this;
                }

                /* renamed from: a */
                public final C0217a mo449a(CharSequence charSequence) {
                    this.f645a.f599f = charSequence;
                    return this;
                }

                /* renamed from: a */
                public final C0217a mo451a(boolean z) {
                    this.f645a.f611r = z;
                    return this;
                }

                /* renamed from: c */
                public final C0217a mo459c(int i, DialogInterface.OnClickListener onClickListener) {
                    AlertController.C0203a aVar = this.f645a;
                    aVar.f608o = aVar.f594a.getText(i);
                    this.f645a.f610q = onClickListener;
                    return this;
                }

                public C0217a(Context context, int i) {
                    this.f645a = new AlertController.C0203a(new ContextThemeWrapper(context, DialogInterfaceC0216c.m661a(context, i)));
                    this.f646b = i;
                }

                /* renamed from: a */
                public final C0217a mo446a(int i, DialogInterface.OnClickListener onClickListener) {
                    AlertController.C0203a aVar = this.f645a;
                    aVar.f602i = aVar.f594a.getText(i);
                    this.f645a.f604k = onClickListener;
                    return this;
                }

                /* renamed from: b */
                public final C0217a mo455b(int i, DialogInterface.OnClickListener onClickListener) {
                    AlertController.C0203a aVar = this.f645a;
                    aVar.f605l = aVar.f594a.getText(i);
                    this.f645a.f607n = onClickListener;
                    return this;
                }

                /* renamed from: c */
                public final C0217a mo460c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f645a.f608o = charSequence;
                    this.f645a.f610q = onClickListener;
                    return this;
                }

                /* renamed from: a */
                public final C0217a mo448a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
                    this.f645a.f616w = listAdapter;
                    this.f645a.f617x = onClickListener;
                    return this;
                }

                /* renamed from: b */
                public final C0217a mo457b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f645a.f605l = charSequence;
                    this.f645a.f607n = onClickListener;
                    return this;
                }

                /* renamed from: a */
                public final C0217a mo450a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f645a.f602i = charSequence;
                    this.f645a.f604k = onClickListener;
                    return this;
                }

                /* renamed from: a */
                public final C0217a mo452a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
                    this.f645a.f615v = charSequenceArr;
                    this.f645a.f617x = onClickListener;
                    return this;
                }
            }

            @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
            public void setTitle(CharSequence charSequence) {
                super.setTitle(charSequence);
                this.f644a.mo379a(charSequence);
            }

            /* renamed from: a */
            public final Button mo440a(int i) {
                AlertController alertController = this.f644a;
                if (i == -3) {
                    return alertController.f560w;
                }
                if (i == -2) {
                    return alertController.f556s;
                }
                if (i != -1) {
                    return null;
                }
                return alertController.f552o;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
                if (androidx.appcompat.app.AlertController.m625a(r12) == false) goto L_0x004f;
             */
            /* JADX WARNING: Removed duplicated region for block: B:101:0x0213  */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0289  */
            /* JADX WARNING: Removed duplicated region for block: B:133:0x0297  */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x02a9  */
            /* JADX WARNING: Removed duplicated region for block: B:138:0x02ac  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
            /* JADX WARNING: Removed duplicated region for block: B:156:0x0343  */
            /* JADX WARNING: Removed duplicated region for block: B:157:0x0348  */
            /* JADX WARNING: Removed duplicated region for block: B:160:0x0356  */
            /* JADX WARNING: Removed duplicated region for block: B:162:0x0370  */
            /* JADX WARNING: Removed duplicated region for block: B:165:0x037d  */
            /* JADX WARNING: Removed duplicated region for block: B:169:0x03a2  */
            /* JADX WARNING: Removed duplicated region for block: B:175:0x03ee  */
            /* JADX WARNING: Removed duplicated region for block: B:183:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x00c8  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0154  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0158  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x0166  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0184  */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x0191  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0194  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01b8  */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x01d9  */
            @Override // androidx.appcompat.app.DialogC0240h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCreate(android.os.Bundle r16) {
                /*
                // Method dump skipped, instructions count: 1037
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogInterfaceC0216c.onCreate(android.os.Bundle):void");
            }

            public DialogInterfaceC0216c(Context context, int i) {
                super(context, m661a(context, i));
            }

            /* renamed from: a */
            static int m661a(Context context, int i) {
                if (((i >>> 24) & 255) > 0) {
                    return i;
                }
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.i6, typedValue, true);
                return typedValue.resourceId;
            }

            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                AlertController alertController = this.f644a;
                if (alertController.f519A == null || !alertController.f519A.mo2946a(keyEvent)) {
                    return super.onKeyDown(i, keyEvent);
                }
                return true;
            }

            public boolean onKeyUp(int i, KeyEvent keyEvent) {
                AlertController alertController = this.f644a;
                if (alertController.f519A == null || !alertController.f519A.mo2946a(keyEvent)) {
                    return super.onKeyUp(i, keyEvent);
                }
                return true;
            }
        }
