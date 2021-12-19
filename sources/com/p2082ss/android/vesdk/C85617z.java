package com.p2082ss.android.vesdk;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.common.C30651j;
import com.p2082ss.android.ttve.model.C30675c;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.C30696i;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.clipparam.VEClipParam;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.p2082ss.android.vesdk.jni.TEAudioEffectInterface;
import com.p2082ss.android.vesdk.p4390f.AbstractC85466c;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import com.p2082ss.android.vesdk.runtime.C85559h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.z */
public final class C85617z implements AbstractC85466c {

    /* renamed from: a */
    private final C85581w f191934a;

    /* renamed from: b */
    private final TEInterface f191935b;

    /* renamed from: c */
    private final TEAudioEffectInterface f191936c;

    /* renamed from: d */
    private int f191937d = -1;

    /* renamed from: e */
    private int f191938e = -1;

    /* renamed from: f */
    private int f191939f = -1;

    /* renamed from: g */
    private int f191940g = -1;

    /* renamed from: h */
    private int f191941h = -1;

    /* renamed from: i */
    private int f191942i = -1;

    /* renamed from: j */
    private C30675c f191943j;

    /* renamed from: k */
    private C85559h f191944k;

    static {
        Covode.recordClassIndex(99801);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: c */
    public final void mo131149c() {
        this.f191943j = null;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: i */
    public final void mo131158i() {
        this.f191942i = -1;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: d */
    public final C30675c mo131152d() {
        return this.f191943j;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: e */
    public final int mo131153e() {
        return this.f191937d;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: f */
    public final int mo131155f() {
        return this.f191939f;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: g */
    public final int mo131156g() {
        return this.f191940g;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: h */
    public final int mo131157h() {
        return this.f191941h;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131125a(int i, String str, int i2, int i3, String str2) {
        MethodCollector.m26663i(13824);
        C85315al.m146641c("VEEditor_VEFilterInvoker", "enableFilterEffectWithTag... " + i + " ");
        if (i < 0 || i > this.f191935b.getDuration() || TextUtils.isEmpty(str)) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "enableFilterEffectWithTag... error. seqIn = " + i + ", effectPath = " + str);
            MethodCollector.m26664o(13824);
            return -100;
        }
        TEVideoUtils.nativeCancelCompileProbe();
        int duration = this.f191935b.getDuration();
        String str3 = "";
        String str4 = str2 == null ? str3 : str2;
        int[] addFilters = this.f191935b.addFilters(new int[]{0}, new String[]{"video effect"}, new int[]{i}, new int[]{duration}, new int[]{0}, new int[]{8});
        this.f191935b.setFilterParam(addFilters[0], "effect res path", str);
        this.f191935b.setFilterParam(addFilters[0], "effect sticker tag", str4);
        this.f191935b.setFilterParam(addFilters[0], "effect sticker id", "0");
        this.f191935b.setFilterParam(addFilters[0], "effect req id", "0");
        C85509a aVar = new C85509a();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        aVar.mo131335a("iesve_veeditor_filter_effect_id", str3);
        C30689e.m63052a("iesve_veeditor_filter_effect", 1, aVar);
        C30696i.C30697a aVar2 = new C30696i.C30697a();
        aVar2.f73425a = str;
        aVar2.f73426b = i;
        this.f191934a.f191816ac.mo55069a(0, addFilters[0], aVar2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("seqIn", i);
            jSONObject.put("stickerId", str3);
            jSONObject.put("effectTag", str2);
            jSONObject.put("filterIndex", addFilters[0]);
            C30683b.m63032a("vesdk_event_editor_filter_effect", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int i4 = addFilters[0];
        MethodCollector.m26664o(13824);
        return i4;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int[] mo131136a(int[] iArr, int[] iArr2, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] > this.f191935b.getDuration() || TextUtils.isEmpty(strArr[i])) {
                return new int[]{-100};
            }
        }
        boolean[] zArr = new boolean[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = false;
            iArr3[i2] = 0;
            iArr4[i2] = 0;
        }
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            strArr2[i3] = "";
        }
        return mo131137a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int[] mo131137a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        String str;
        if (iArr != null && iArr.length > 0 && iArr2 != null && iArr2.length > 0 && strArr2 != null && strArr2.length > 0 && strArr != null && strArr.length > 0) {
            C85315al.m146641c("VEEditor_VEFilterInvoker", "addFilterEffectsWithTag: in " + iArr[0] + ", out " + iArr2[0] + ", tag " + strArr2[0] + ", path " + strArr[0]);
        }
        int i = 0;
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            if ("FreezeFrame".equals(strArr2[i2])) {
                i = Math.max(i, iArr2[i2]);
            }
        }
        this.f191934a.mo131697i(i);
        int length = iArr.length;
        int[] iArr5 = new int[length];
        int[] iArr6 = new int[length];
        int[] iArr7 = new int[length];
        String[] strArr3 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr5[i3] = 0;
            iArr6[i3] = 0;
            strArr3[i3] = "filter effect";
            iArr7[i3] = 8;
        }
        int[] addFilters = this.f191935b.addFilters(iArr5, strArr3, iArr, iArr2, iArr6, iArr7);
        if (length != addFilters.length) {
            int[] iArr8 = new int[length];
            Arrays.fill(iArr8, -1);
            return iArr8;
        }
        for (int i4 = 0; i4 < length; i4++) {
            this.f191935b.setFilterParam(addFilters[i4], "effect res path", strArr[i4]);
            TEInterface tEInterface = this.f191935b;
            int i5 = addFilters[i4];
            if (strArr2[i4] == null) {
                str = "";
            } else {
                str = strArr2[i4];
            }
            tEInterface.setFilterParam(i5, "effect sticker tag", str);
            this.f191935b.setFilterParam(addFilters[i4], "effect sticker id", new StringBuilder().append(iArr3[i4]).toString());
            this.f191935b.setFilterParam(addFilters[i4], "effect req id", new StringBuilder().append(iArr4[i4]).toString());
            C30696i.C30697a aVar = new C30696i.C30697a();
            aVar.f73425a = strArr[i4];
            aVar.f73426b = iArr[i4];
            aVar.f73427c = iArr2[i4] - iArr[i4];
            this.f191934a.f191816ac.mo55069a(0, addFilters[i4], aVar);
        }
        return addFilters;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131132a(int[] iArr) {
        C85315al.m146637a("VEEditor_VEFilterInvoker", "deleteFilterEffects...");
        for (int i : iArr) {
            this.f191934a.f191816ac.mo55068a(0, i);
        }
        return this.f191935b.removeFilter(iArr);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131129a(String str, float f, boolean z) {
        MethodCollector.m26663i(12599);
        synchronized (this.f191934a) {
            try {
                C85315al.m146637a("VEEditor_VEFilterInvoker", "setColorFilter normal...");
                if (this.f191937d < 0) {
                    C85315al.m146642d("VEEditor_VEFilterInvoker", "setColorFilter... mColorFilterIndex error.");
                    return -105;
                } else if (f < 0.0f || str == null) {
                    C85315al.m146642d("VEEditor_VEFilterInvoker", "setColorFilter... param error. intensity = " + f + ", filterPath = " + str);
                    MethodCollector.m26664o(12599);
                    return -100;
                } else {
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    if (this.f191943j == null) {
                        this.f191943j = new C30675c();
                    }
                    if (z || !str.equals(this.f191943j.f73366a) || this.f191943j.f73367b.length() != 0 || this.f191943j.f73369d != f || this.f191943j.f73368c != 1.0f || this.f191943j.f73371f) {
                        this.f191943j.f73366a = str;
                        this.f191943j.f73367b = "";
                        this.f191943j.f73368c = 1.0f;
                        this.f191943j.f73369d = f;
                        this.f191943j.f73370e = f;
                        this.f191943j.f73371f = false;
                        this.f191943j.f73372g = false;
                        this.f191935b.setFilterParam(this.f191937d, "left filter", str);
                        this.f191935b.setFilterParam(this.f191937d, "use filter res intensity", "false");
                        this.f191935b.setFilterParam(this.f191937d, "left filter intensity", String.valueOf(f));
                        this.f191935b.setFilterParam(this.f191937d, "right filter", "");
                        this.f191935b.setFilterParam(this.f191937d, "filter position", "1.0");
                        C85509a aVar = new C85509a();
                        String str2 = "";
                        if (!TextUtils.isEmpty(str)) {
                            String[] split = str.split(File.separator);
                            if (split.length > 0) {
                                str2 = split[split.length - 1];
                            }
                        }
                        aVar.mo131335a("iesve_veeditor_set_filter_click_filter_id", str2);
                        C30689e.m63052a("iesve_veeditor_set_filter_click", 1, aVar);
                        C30695h.m63063a(1, "te_composition_filter_id", str);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("filterPath", str);
                            jSONObject.put("intensity", String.valueOf(f));
                            jSONObject.put("tag", "setColorFilter");
                            C30683b.m63032a("vesdk_event_editor_color_filter", jSONObject, "behavior");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        MethodCollector.m26664o(12599);
                        return 0;
                    }
                    MethodCollector.m26664o(12599);
                    return 0;
                }
            } finally {
                MethodCollector.m26664o(12599);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x015b  */
    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131131a(java.lang.String r9, java.lang.String r10, float r11, float r12, float r13) {
        /*
        // Method dump skipped, instructions count: 381
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85617z.mo131131a(java.lang.String, java.lang.String, float, float, float):int");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131127a(String str, double d) {
        MethodCollector.m26663i(13997);
        synchronized (this.f191934a) {
            try {
                C85315al.m146637a("VEEditor_VEFilterInvoker", "setLensHDRFilter modelPath = " + str + ", intensity = 1.0");
                int i = this.f191940g;
                if (i < 0) {
                    return -105;
                }
                if (str == null) {
                    str = "";
                    d = 0.0d;
                }
                this.f191935b.setFilterParam(i, "lens hdr model path", str);
                this.f191935b.setFilterParam(this.f191940g, "lens hdr indensity", String.valueOf(d));
                MethodCollector.m26664o(13997);
                return 0;
            } finally {
                MethodCollector.m26664o(13997);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final void mo131134a(boolean z) {
        this.f191935b.setDleEnabled(z);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final void mo131133a(int i) {
        this.f191935b.setDldThrVal(i);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int[] mo131135a(int i, int i2, VECherEffectParam vECherEffectParam) {
        int length = vECherEffectParam.getMatrix().length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        String[] strArr = new String[length];
        int[] iArr4 = new int[length];
        int[] iArr5 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
            iArr2[i3] = 1;
            strArr[i3] = "audio chereffect";
            iArr3[i3] = 1;
            int i4 = i3 * 2;
            iArr4[i3] = (int) vECherEffectParam.getDuration()[i4];
            iArr5[i3] = (int) vECherEffectParam.getDuration()[i4 + 1];
        }
        int[] addFilters = this.f191935b.addFilters(iArr, strArr, iArr4, iArr5, iArr2, iArr3);
        for (int i5 = 0; i5 < length; i5++) {
            this.f191935b.setFilterParam(addFilters[i5], "cher_matrix", vECherEffectParam.getMatrix()[i5]);
        }
        return addFilters;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127  */
    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131130a(java.lang.String r9, java.lang.String r10, float r11) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85617z.mo131130a(java.lang.String, java.lang.String, float):int");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: j */
    public final void mo131159j() {
        this.f191936c.clearNative();
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131118a() {
        try {
            int i = this.f191934a.f191779P;
            int[] addFilters = this.f191935b.addFilters(new int[]{0, 0, 0}, new String[]{"color filter", "effect hdr filter", "lens hdr filter"}, new int[]{0, 0, 0}, new int[]{i, i, i}, new int[]{0, 0, 0}, new int[]{7, 16, 33}, new int[]{1, 0, 0});
            this.f191937d = addFilters[0];
            this.f191939f = addFilters[1];
            this.f191940g = addFilters[2];
            C85581w wVar = this.f191934a;
            if (wVar.f191790a != null && wVar.f191790a.isMVInitialedInternal()) {
                for (int i2 : addFilters) {
                    wVar.f191790a.addMVFilterInternal(i2);
                }
            }
            return 0;
        } catch (NullPointerException unused) {
            throw new C85615x(-1, "init failed: VESDK need to be init");
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final void mo131144b() {
        C85315al.m146642d("VEEditor_VEFilterInvoker", "updateFilters");
        int duration = this.f191935b.getDuration();
        int i = this.f191937d;
        if (i >= 0) {
            this.f191935b.adjustFilterInOut(i, 0, duration);
        }
        int i2 = this.f191939f;
        if (i2 >= 0) {
            this.f191935b.adjustFilterInOut(i2, 0, duration);
        }
        int i3 = this.f191940g;
        if (i3 >= 0) {
            this.f191935b.adjustFilterInOut(i3, 0, duration);
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final void mo131145b(boolean z) {
        this.f191935b.setDleEnabledPreview(z);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: c */
    public final void mo131150c(boolean z) {
        this.f191935b.setDldEnabled(z);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final float mo131117a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f191935b.getColorFilterIntensity(str);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final int mo131143b(int[] iArr) {
        int removeFilter;
        MethodCollector.m26663i(14022);
        synchronized (this.f191934a) {
            try {
                C85315al.m146637a("VEEditor_VEFilterInvoker", "deleteFilters...");
                removeFilter = this.f191935b.removeFilter(iArr);
            } finally {
                MethodCollector.m26664o(14022);
            }
        }
        return removeFilter;
    }

    public C85617z(C85581w wVar) {
        this.f191934a = wVar;
        TEInterface tEInterface = wVar.f191765B;
        this.f191935b = tEInterface;
        this.f191936c = new TEAudioEffectInterface(tEInterface.getNativeHandler());
        this.f191944k = new C85559h();
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131126a(VEEditorModel vEEditorModel) {
        this.f191937d = vEEditorModel.f190769k;
        this.f191939f = vEEditorModel.f190770l;
        this.f191940g = vEEditorModel.f190771m;
        this.f191941h = vEEditorModel.f190767i;
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: c */
    public final int mo131148c(int[] iArr) {
        int removeFilter;
        MethodCollector.m26663i(14230);
        synchronized (this.f191934a) {
            try {
                C85315al.m146641c("VEEditor_VEFilterInvoker", "deleteAudioFilter..." + iArr[0]);
                removeFilter = this.f191935b.removeFilter(iArr);
            } finally {
                MethodCollector.m26664o(14230);
            }
        }
        return removeFilter;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: e */
    public final int mo131154e(int i) {
        int i2;
        MethodCollector.m26663i(14196);
        synchronized (this.f191934a) {
            try {
                C85559h hVar = this.f191944k;
                int b = hVar.mo131531b();
                if (b == C85559h.f191712c) {
                    VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) hVar.f191714e.f191731g;
                    i2 = vERepeatFilterParam.repeatDuration * (vERepeatFilterParam.repeatTime - 1);
                } else if (b == C85559h.f191713d) {
                    VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) hVar.f191714e.f191731g;
                    i2 = ((int) (((float) vESlowMotionFilterParam.slowMotionDuration) / vESlowMotionFilterParam.slowMotionSpeed)) - vESlowMotionFilterParam.slowMotionDuration;
                }
                i -= i2;
            } finally {
                MethodCollector.m26664o(14196);
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131151d(int r7) {
        /*
            r6 = this;
            com.ss.android.vesdk.runtime.h r5 = r6.f191944k
            int r4 = r5.mo131531b()
            int r0 = com.p2082ss.android.vesdk.runtime.C85559h.f191712c
            if (r4 != r0) goto L_0x001a
            com.ss.android.vesdk.runtime.h$b r0 = r5.f191714e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r3 = r0.f191731g
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r3 = (com.p2082ss.android.vesdk.filterparam.VERepeatFilterParam) r3
            int r2 = r3.seqIn
            int r1 = r3.repeatDuration
            int r0 = r3.repeatTime
            int r1 = r1 * r0
            int r1 = r1 + r2
            if (r7 >= r2) goto L_0x004e
        L_0x001a:
            r1 = r7
        L_0x001b:
            int r0 = com.p2082ss.android.vesdk.runtime.C85559h.f191713d
            if (r4 != r0) goto L_0x004c
            com.ss.android.vesdk.runtime.h$b r0 = r5.f191714e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r4 = r0.f191731g
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r4 = (com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam) r4
            int r3 = r4.seqIn
            float r2 = (float) r3
            int r0 = r4.slowMotionDuration
            float r1 = (float) r0
            float r0 = r4.slowMotionSpeed
            float r1 = r1 / r0
            float r2 = r2 + r1
            int r0 = (int) r2
            if (r7 >= r3) goto L_0x0033
        L_0x0032:
            return r7
        L_0x0033:
            if (r7 < r3) goto L_0x003f
            if (r7 >= r0) goto L_0x003f
            int r7 = r7 - r3
            float r1 = (float) r7
            float r0 = r4.slowMotionSpeed
            float r1 = r1 * r0
            int r7 = (int) r1
            int r7 = r7 + r3
            goto L_0x0032
        L_0x003f:
            int r0 = r4.slowMotionDuration
            float r1 = (float) r0
            float r0 = r4.slowMotionSpeed
            float r1 = r1 / r0
            int r0 = r4.slowMotionDuration
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            int r7 = r7 - r0
            goto L_0x0032
        L_0x004c:
            r7 = r1
            goto L_0x0032
        L_0x004e:
            if (r7 < r2) goto L_0x0059
            if (r7 >= r1) goto L_0x0059
            int r1 = r7 - r2
            int r0 = r3.repeatDuration
            int r1 = r1 % r0
            int r1 = r1 + r2
            goto L_0x001b
        L_0x0059:
            int r1 = r3.repeatDuration
            int r0 = r3.repeatTime
            int r0 = r0 + -1
            int r1 = r1 * r0
            int r1 = r7 - r1
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85617z.mo131151d(int):int");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final int mo131141b(String str) {
        C85315al.m146637a("VEEditor_VEFilterInvoker", "setEffectHDRFilter filterPath=".concat(String.valueOf(str)));
        C85315al.m146637a("VEEditor_VEFilterInvoker", "setEffectHDRFilter filterPath=" + str + ", intensity=1.0");
        return m147708c(str, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131146c(int r6) {
        /*
            r5 = this;
            com.ss.android.vesdk.runtime.h r4 = r5.f191944k
            int r3 = r4.mo131531b()
            int r0 = com.p2082ss.android.vesdk.runtime.C85559h.f191712c
            if (r3 != r0) goto L_0x0017
            com.ss.android.vesdk.runtime.h$b r0 = r4.f191714e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r2 = r0.f191731g
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r2 = (com.p2082ss.android.vesdk.filterparam.VERepeatFilterParam) r2
            int r1 = r2.seqIn
            int r0 = r2.repeatDuration
            int r1 = r1 + r0
            if (r6 >= r1) goto L_0x0045
        L_0x0017:
            r1 = r6
        L_0x0018:
            int r0 = com.p2082ss.android.vesdk.runtime.C85559h.f191713d
            if (r3 != r0) goto L_0x0043
            com.ss.android.vesdk.runtime.h$b r0 = r4.f191714e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r3 = r0.f191731g
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r3 = (com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam) r3
            int r2 = r3.seqIn
            int r0 = r3.slowMotionDuration
            int r0 = r0 + r2
            if (r6 >= r2) goto L_0x002a
        L_0x0029:
            return r6
        L_0x002a:
            if (r6 < r2) goto L_0x0036
            if (r6 >= r0) goto L_0x0036
            int r6 = r6 - r2
            float r1 = (float) r6
            float r0 = r3.slowMotionSpeed
            float r1 = r1 / r0
            int r6 = (int) r1
            int r6 = r6 + r2
            goto L_0x0029
        L_0x0036:
            int r0 = r3.slowMotionDuration
            float r1 = (float) r0
            float r0 = r3.slowMotionSpeed
            float r1 = r1 / r0
            int r0 = r3.slowMotionDuration
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            int r6 = r6 + r0
            goto L_0x0029
        L_0x0043:
            r6 = r1
            goto L_0x0029
        L_0x0045:
            int r1 = r2.repeatDuration
            int r0 = r2.repeatTime
            int r0 = r0 + -1
            int r1 = r1 * r0
            int r1 = r1 + r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85617z.mo131146c(int):int");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final int mo131138b(int i) {
        boolean z;
        MethodCollector.m26663i(14183);
        synchronized (this.f191934a) {
            try {
                C85315al.m146642d(C85559h.f191710a, "TimeEffect deleteTimeEffect...  filterIndexes: " + i + " audioFilterIndex:" + this.f191944k.f191714e.f191730f);
                C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect before getDuration =" + this.f191935b.getDuration());
                if (i < 0) {
                    return -1;
                }
                if (this.f191935b.getCurState() != -20000) {
                    z = true;
                    int stop = this.f191935b.stop();
                    if (!(stop == 0 || stop == -101)) {
                        C85315al.m146637a("VEEditor_VEFilterInvoker", "pauseSync failed, ret ".concat(String.valueOf(stop)));
                        MethodCollector.m26664o(14183);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int removeFilter = this.f191935b.removeFilter(new int[]{i});
                if (this.f191934a.f191838e.f191690k == 1 && this.f191944k.f191714e.f191730f >= 0) {
                    removeFilter = this.f191935b.removeFilter(new int[]{this.f191944k.f191714e.f191730f});
                }
                this.f191934a.f191838e.f191688i = C85581w.EnumC85609h.EDITOR_NORMAl_MODE.ordinal();
                if (this.f191944k.mo131531b() == C85559h.f191711b) {
                    this.f191944k.mo131529a();
                } else {
                    ArrayList<VEClipParam> arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<VEClipParam> arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    C85559h hVar = this.f191944k;
                    C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect  mTrack.videoClips=" + hVar.f191714e.f191725a.size() + "mTrack.videoTimeEffectClips=" + hVar.f191714e.f191727c.size() + "mTrack.audioClips=" + hVar.f191714e.f191726b.size() + "mTrack.audioTimeEffectClips=" + hVar.f191714e.f191728d.size());
                    if (hVar.f191714e.f191725a.size() > 0) {
                        C85559h.m147465a(hVar.f191714e.f191725a, hVar.f191714e.f191727c, arrayList, arrayList2);
                    }
                    if (hVar.f191714e.f191726b.size() > 0) {
                        C85559h.m147465a(hVar.f191714e.f191726b, hVar.f191714e.f191728d, arrayList3, arrayList4);
                    }
                    hVar.mo131529a();
                    C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect deleteVideoClip begin");
                    for (VEClipParam vEClipParam : arrayList) {
                        int deleteClip = this.f191935b.deleteClip(0, this.f191934a.f191764A, vEClipParam.clipIndex);
                        if (deleteClip < 0) {
                            C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect deleteVideoClip failed, ret = ".concat(String.valueOf(deleteClip)));
                        }
                        C85315al.m146639b(C85559h.f191710a, "deleteTimeEffect deleteVideoClip =" + vEClipParam.toString());
                    }
                    C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect deleteVideoClip end");
                    C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateVideoClip begin");
                    VEClipTimelineParam[] vEClipTimelineParamArr = new VEClipTimelineParam[arrayList2.size()];
                    int[] iArr = new int[arrayList2.size()];
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        vEClipTimelineParamArr[i2] = new VEClipTimelineParam();
                        vEClipTimelineParamArr[i2].trimIn = ((VEClipParam) arrayList2.get(i2)).trimIn;
                        vEClipTimelineParamArr[i2].trimOut = ((VEClipParam) arrayList2.get(i2)).trimOut;
                        vEClipTimelineParamArr[i2].speed = ((VEClipParam) arrayList2.get(i2)).speed;
                        iArr[i2] = ((VEClipParam) arrayList2.get(i2)).clipIndex;
                        C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateVideoClip =" + ((VEClipParam) arrayList2.get(i2)).toString());
                    }
                    int updateClipsTimelineParam = this.f191935b.updateClipsTimelineParam(0, this.f191934a.f191764A, iArr, vEClipTimelineParamArr);
                    if (updateClipsTimelineParam < 0) {
                        C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam)));
                    }
                    C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateVideoClip end");
                    if (this.f191934a.f191838e.f191690k == 1 && (arrayList3.size() > 0 || arrayList4.size() > 0)) {
                        C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect deleteAuidoClip begin");
                        for (VEClipParam vEClipParam2 : arrayList3) {
                            int deleteClip2 = this.f191935b.deleteClip(1, this.f191934a.f191838e.f191689j, vEClipParam2.clipIndex);
                            if (deleteClip2 < 0) {
                                C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect deleteAuidoClip failed, ret = ".concat(String.valueOf(deleteClip2)));
                            }
                            C85315al.m146639b(C85559h.f191710a, "deleteTimeEffect deleteAuidoClip =" + vEClipParam2.toString());
                        }
                        C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect deleteAuidoClip end");
                        C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateAudioClip begin");
                        VEClipTimelineParam[] vEClipTimelineParamArr2 = new VEClipTimelineParam[arrayList4.size()];
                        int[] iArr2 = new int[arrayList4.size()];
                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                            vEClipTimelineParamArr2[i3] = new VEClipTimelineParam();
                            vEClipTimelineParamArr2[i3].trimIn = ((VEClipParam) arrayList4.get(i3)).trimIn;
                            vEClipTimelineParamArr2[i3].trimOut = ((VEClipParam) arrayList4.get(i3)).trimOut;
                            vEClipTimelineParamArr2[i3].speed = ((VEClipParam) arrayList4.get(i3)).speed;
                            iArr2[i3] = ((VEClipParam) arrayList4.get(i3)).clipIndex;
                            C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateAudioClip =" + ((VEClipParam) arrayList4.get(i3)).toString());
                        }
                        int updateClipsTimelineParam2 = this.f191935b.updateClipsTimelineParam(1, this.f191934a.f191838e.f191689j, iArr, vEClipTimelineParamArr2);
                        if (updateClipsTimelineParam2 < 0) {
                            C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam2)));
                        }
                        C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect updateAudioClip end");
                    }
                    C85315al.m146642d(C85559h.f191710a, "deleteTimeEffect after getDuration =" + this.f191935b.getDuration());
                }
                TEInterface tEInterface = this.f191935b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                this.f191934a.f191816ac.f73424c = 0;
                if (z) {
                    this.f191935b.createTimeline();
                    this.f191935b.prepareEngine(0);
                }
                MethodCollector.m26664o(14183);
                return removeFilter;
            } finally {
                MethodCollector.m26664o(14183);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131128a(String str, float f) {
        return mo131129a(str, f, false);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final int mo131139b(int i, int i2) {
        C85315al.m146641c("VEEditor_VEFilterInvoker", "disableAudioEffect... filterIndex " + i + ", outPoint " + i2);
        if (i == -1) {
            return -100;
        }
        return this.f191935b.adjustFilterInOut(i, -1, i2);
    }

    /* renamed from: c */
    private int m147708c(String str, float f) {
        int i;
        MethodCollector.m26663i(13914);
        synchronized (this.f191934a) {
            try {
                C85315al.m146637a("VEEditor_VEFilterInvoker", "setEffectHDRFilter type=1, filterPath=" + str + ", intensity=1.0");
                int i2 = this.f191939f;
                if (i2 < 0) {
                    return -105;
                }
                if (str == null) {
                    str = "";
                    f = 0.0f;
                }
                this.f191935b.setFilterParam(i2, "effect hdr type", "1");
                this.f191935b.setFilterParam(this.f191939f, "effect hdr res path", str);
                this.f191935b.setFilterParam(this.f191939f, "effect hdr intensity", String.valueOf(f));
                if (str.length() > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                C30689e.m63052a("iesve_veeditor_set_effect_hdr", i, (C85509a) null);
                MethodCollector.m26664o(13914);
                return 0;
            } finally {
                MethodCollector.m26664o(13914);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131119a(int i, int i2) {
        C85315al.m146641c("VEEditor_VEFilterInvoker", "disableFilterEffect... " + i + " " + i2);
        if (i < 0 || i2 < 0) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "disableFilterEffect... error. effectIndex = " + i + ", outPoint = " + i2);
            return -100;
        }
        C30696i.C30697a aVar = this.f191934a.f191816ac.f73422a.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f73427c = i2 - aVar.f73426b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("outPoint", i2);
            jSONObject.put("effectIndex", i);
            C30683b.m63032a("vesdk_event_editor_filter_effect_end", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f191935b.adjustFilterInOut(i, -1, i2);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final int mo131142b(String str, float f) {
        MethodCollector.m26663i(13735);
        C85315al.m146637a("VEEditor_VEFilterInvoker", "setColorFilterNew normal...");
        synchronized (this.f191934a) {
            try {
                if (this.f191937d < 0) {
                    C85315al.m146642d("VEEditor_VEFilterInvoker", "setColorFilterNew... mColorFilterIndex error.");
                    return -105;
                } else if (str == null) {
                    C85315al.m146642d("VEEditor_VEFilterInvoker", "setColorFilterNew... param error.");
                    MethodCollector.m26664o(13735);
                    return -100;
                } else {
                    if (f > 1.0f) {
                        f = 1.0f;
                    } else if (f < 0.0f) {
                        f = -1.0f;
                    }
                    if (this.f191943j == null) {
                        this.f191943j = new C30675c();
                    }
                    if (str.equals(this.f191943j.f73366a) && this.f191943j.f73367b.length() == 0 && this.f191943j.f73369d == f && this.f191943j.f73368c == 1.0f) {
                        MethodCollector.m26664o(13735);
                        return 0;
                    }
                    this.f191943j.f73366a = str;
                    this.f191943j.f73367b = "";
                    this.f191943j.f73368c = 1.0f;
                    this.f191943j.f73369d = f;
                    this.f191943j.f73370e = f;
                    this.f191943j.f73371f = false;
                    this.f191943j.f73372g = true;
                    this.f191935b.setFilterParam(this.f191937d, "left filter", str);
                    this.f191935b.setFilterParam(this.f191937d, "left filter intensity", String.valueOf(f));
                    this.f191935b.setFilterParam(this.f191937d, "right filter", "");
                    this.f191935b.setFilterParam(this.f191937d, "filter position", "1.0");
                    this.f191935b.setFilterParam(this.f191937d, "filter use v3", "true");
                    C85509a aVar = new C85509a();
                    String str2 = "";
                    if (!TextUtils.isEmpty(str)) {
                        String[] split = str.split(File.separator);
                        if (split.length > 0) {
                            str2 = split[split.length - 1];
                        }
                    }
                    aVar.mo131335a("iesve_veeditor_set_filter_click_filter_id", str2);
                    C30689e.m63052a("iesve_veeditor_set_filter_click", 1, aVar);
                    C30695h.m63063a(1, "te_composition_filter_id", str);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("filterPath", str);
                        jSONObject.put("intensity", String.valueOf(f));
                        jSONObject.put("tag", "setColorFilterNew");
                        C30683b.m63032a("vesdk_event_editor_color_filter", jSONObject, "behavior");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    MethodCollector.m26664o(13735);
                    return 0;
                }
            } finally {
                MethodCollector.m26664o(13735);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131124a(int i, VEBaseFilterParam vEBaseFilterParam) {
        int i2;
        MethodCollector.m26663i(14105);
        synchronized (this.f191934a) {
            try {
                C85315al.m146637a("VEEditor_VEFilterInvoker", "updateTrackFilterParam, filterIndex: " + i + ", param = " + vEBaseFilterParam.toString());
                int i3 = -1;
                if (vEBaseFilterParam.filterType == 1) {
                    TEAudioEffectInterface tEAudioEffectInterface = this.f191936c;
                    if (tEAudioEffectInterface == null) {
                        C85315al.m146642d("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                        return -1;
                    }
                    i2 = tEAudioEffectInterface.updateAudioFilterParam(-1, i, vEBaseFilterParam);
                } else {
                    i2 = this.f191935b.updateFilterParam(-1, i, vEBaseFilterParam);
                }
                if (i2 >= 0) {
                    i3 = 0;
                }
                MethodCollector.m26664o(14105);
                return i3;
            } finally {
                MethodCollector.m26664o(14105);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131120a(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        return mo131121a(i, i2, vEBaseFilterParam, 0, this.f191934a.f191779P);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: b */
    public final int mo131140b(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        int i3;
        MethodCollector.m26663i(14066);
        synchronized (this.f191934a) {
            try {
                C85315al.m146639b("VEEditor_VEFilterInvoker", "updateClipFilterParam, clipIndex:" + i + ",filterIndex:" + i2);
                int i4 = -1;
                if (vEBaseFilterParam.filterType == 1) {
                    TEAudioEffectInterface tEAudioEffectInterface = this.f191936c;
                    if (tEAudioEffectInterface == null) {
                        C85315al.m146642d("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                        return -1;
                    }
                    i3 = tEAudioEffectInterface.updateAudioFilterParam(i, i2, vEBaseFilterParam);
                } else {
                    i3 = this.f191935b.updateFilterParam(i, i2, vEBaseFilterParam);
                }
                if (i3 >= 0) {
                    i4 = 0;
                }
                MethodCollector.m26664o(14066);
                return i4;
            } finally {
                MethodCollector.m26664o(14066);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: c */
    public final int mo131147c(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        boolean z;
        int i3;
        float f;
        SparseArray sparseArray;
        MethodCollector.m26663i(14162);
        synchronized (this.f191934a) {
            try {
                if (vEBaseFilterParam instanceof VERepeatFilterParam) {
                    VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) vEBaseFilterParam;
                    if (vERepeatFilterParam.seqIn + vERepeatFilterParam.repeatDuration > this.f191935b.getDuration()) {
                        C85315al.m146642d("VEEditor_VEFilterInvoker", "(repeatFilterParam.seqIn + repeatFilterParam.repeatDuration) > mNativeEditor.getDuration() error");
                        MethodCollector.m26664o(14162);
                        return -1;
                    }
                } else if (vEBaseFilterParam instanceof VESlowMotionFilterParam) {
                    VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) vEBaseFilterParam;
                    if (vESlowMotionFilterParam.seqIn + vESlowMotionFilterParam.slowMotionDuration > this.f191935b.getDuration()) {
                        C85315al.m146642d("VEEditor_VEFilterInvoker", "((slowFilterParam.seqIn + slowFilterParam.slowMotionDuration) > mNativeEditor.getDuration() error");
                        MethodCollector.m26664o(14162);
                        return -1;
                    }
                }
                TEVideoUtils.nativeCancelCompileProbe();
                if (this.f191935b.getCurState() != -20000) {
                    z = true;
                    i3 = this.f191935b.stop();
                    if (!(i3 == 0 || i3 == -101)) {
                        C85315al.m146642d("VEEditor_VEFilterInvoker", "stopSync failed in addTimeEffect, ret=" + i3 + ", for filtername=" + vEBaseFilterParam.filterName);
                        MethodCollector.m26664o(14162);
                        return -1;
                    }
                } else {
                    z = false;
                    i3 = 0;
                }
                int[] iArr = {-1};
                int[] iArr2 = {-1};
                int duration = this.f191935b.getDuration();
                if (vEBaseFilterParam.filterType == 25) {
                    if (vEBaseFilterParam instanceof VERepeatFilterParam) {
                        VERepeatFilterParam vERepeatFilterParam2 = (VERepeatFilterParam) vEBaseFilterParam;
                        iArr = this.f191935b.addFilters(new int[]{0}, new String[]{vERepeatFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{0}, new int[]{25}, new int[]{vERepeatFilterParam2.filterDurationType});
                        this.f191934a.f191838e.f191688i = vERepeatFilterParam2.timeMode;
                        this.f191935b.setFilterParam(iArr[0], "timeEffect seqin", new StringBuilder().append(vERepeatFilterParam2.seqIn).toString());
                        this.f191935b.setFilterParam(iArr[0], "timeEffect repeating duration", new StringBuilder().append(vERepeatFilterParam2.repeatDuration).toString());
                        this.f191935b.setFilterParam(iArr[0], "timeEffect repeating times", new StringBuilder().append(vERepeatFilterParam2.repeatTime).toString());
                        this.f191935b.setFilterParam(iArr[0], "timeEffect repeating mode", new StringBuilder().append(vERepeatFilterParam2.timeMode).toString());
                        if (this.f191934a.f191838e.f191690k == 1) {
                            iArr2 = this.f191935b.addFilters(new int[]{this.f191934a.f191838e.f191689j}, new String[]{vERepeatFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{1}, new int[]{25}, new int[]{vERepeatFilterParam2.filterDurationType});
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect seqin", new StringBuilder().append(vERepeatFilterParam2.seqIn).toString());
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect repeating duration", new StringBuilder().append(vERepeatFilterParam2.repeatDuration).toString());
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect repeating times", new StringBuilder().append(vERepeatFilterParam2.repeatTime).toString());
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect repeating mode", new StringBuilder().append(vERepeatFilterParam2.timeMode).toString());
                        }
                        C85315al.m146642d(C85559h.f191710a, "TimeEffect addRepeatEffect...  trackIndex:0" + " trackType:0" + " filterIndex:" + iArr[0] + " audioFilterIndex:" + iArr2[0] + " seqIn:" + vERepeatFilterParam2.seqIn + " seqOut:" + vERepeatFilterParam2.seqOut + " repeatDuration:" + vERepeatFilterParam2.repeatDuration + " repeatTime:" + vERepeatFilterParam2.repeatTime + " timeMode:" + vERepeatFilterParam2.timeMode);
                        C85509a aVar = new C85509a();
                        aVar.mo131335a("iesve_veeditor_time_effect_id", "repeat");
                        C30689e.m63052a("iesve_veeditor_time_effect", 1, aVar);
                        this.f191934a.f191816ac.f73424c = 1;
                    } else if (vEBaseFilterParam instanceof VESlowMotionFilterParam) {
                        VESlowMotionFilterParam vESlowMotionFilterParam2 = (VESlowMotionFilterParam) vEBaseFilterParam;
                        iArr = this.f191935b.addFilters(new int[]{0}, new String[]{vESlowMotionFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{0}, new int[]{25}, new int[]{vESlowMotionFilterParam2.filterDurationType});
                        this.f191934a.f191838e.f191688i = vESlowMotionFilterParam2.timeMode;
                        this.f191935b.setFilterParam(iArr[0], "timeEffect seqin", new StringBuilder().append(vESlowMotionFilterParam2.seqIn).toString());
                        this.f191935b.setFilterParam(iArr[0], "timeEffect slow motion duration", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionDuration).toString());
                        this.f191935b.setFilterParam(iArr[0], "timeEffect slow motion speed", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionSpeed).toString());
                        this.f191935b.setFilterParam(iArr[0], "timeEffect slow motion mode", new StringBuilder().append(vESlowMotionFilterParam2.timeMode).toString());
                        if (this.f191934a.f191838e.f191690k == 1) {
                            iArr2 = this.f191935b.addFilters(new int[]{this.f191934a.f191838e.f191689j}, new String[]{vESlowMotionFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{1}, new int[]{25}, new int[]{vESlowMotionFilterParam2.filterDurationType});
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect seqin", new StringBuilder().append(vESlowMotionFilterParam2.seqIn).toString());
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect slow motion duration", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionDuration).toString());
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect slow motion speed", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionSpeed).toString());
                            this.f191935b.setFilterParam(iArr2[0], "timeEffect slow motion mode", new StringBuilder().append(vESlowMotionFilterParam2.timeMode).toString());
                        }
                        C85315al.m146639b(C85559h.f191710a, "TimeEffect addRepeatEffect...  trackIndex:0" + " trackType:0" + " filterIndex:" + iArr[0] + " audioFilterIndex:" + iArr2[0] + " seqIn:" + vESlowMotionFilterParam2.seqIn + " seqOut:" + vESlowMotionFilterParam2.seqOut + " slowMotionDuration:" + vESlowMotionFilterParam2.slowMotionDuration + " slowMotionSpeed:" + vESlowMotionFilterParam2.slowMotionSpeed + " timeMode:" + vESlowMotionFilterParam2.timeMode);
                        C85509a aVar2 = new C85509a();
                        aVar2.mo131335a("iesve_veeditor_time_effect_id", "slow");
                        C30689e.m63052a("iesve_veeditor_time_effect", 1, aVar2);
                        this.f191934a.f191816ac.f73424c = 2;
                    }
                }
                ArrayList<VEClipParam> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<VEClipParam> arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C85581w wVar = this.f191934a;
                List<VEClipParam> g = wVar.mo131692g(0, wVar.f191764A);
                ArrayList arrayList5 = new ArrayList();
                if (this.f191934a.f191838e.f191690k == 1) {
                    C85581w wVar2 = this.f191934a;
                    arrayList5.addAll(wVar2.mo131692g(1, wVar2.f191838e.f191689j));
                    f = this.f191935b.getTrackVolume(1, this.f191934a.f191838e.f191689j, 0);
                } else {
                    f = 0.0f;
                }
                float trackVolume = this.f191935b.getTrackVolume(0, this.f191934a.f191764A, 0);
                C85315al.m146642d(C85559h.f191710a, "addTimeEffect mOriginalSoundTrackType=" + this.f191934a.f191838e.f191690k + " mOriginalSoundTrackIndex=" + this.f191934a.f191838e.f191689j + " originalAudio.size=" + arrayList5.size() + " videoVolume=" + trackVolume + " audioVolume=" + f);
                this.f191944k.mo131530a(iArr[0], iArr2[0], g, arrayList5, vEBaseFilterParam, arrayList, arrayList2, arrayList3, arrayList4);
                for (VEClipParam vEClipParam : arrayList) {
                    VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                    vEClipSourceParam.clipFilePath = vEClipParam.path;
                    vEClipSourceParam.sourceType = 0;
                    VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                    vEClipTimelineParam.trimIn = vEClipParam.trimIn;
                    vEClipTimelineParam.trimOut = vEClipParam.trimOut;
                    vEClipTimelineParam.speed = vEClipParam.speed;
                    C85315al.m146637a(C85559h.f191710a, "addTimeEffect insertVideoClip =" + vEClipParam.toString());
                    int insertClip = this.f191935b.insertClip(0, this.f191934a.f191764A, vEClipParam.clipIndex, vEClipSourceParam, vEClipTimelineParam);
                    if (insertClip < 0) {
                        C85315al.m146642d(C85559h.f191710a, "addTimeEffect insertVideoClip failed, ret = " + insertClip + " clipParam=" + vEClipParam.toString());
                    }
                }
                VEClipTimelineParam[] vEClipTimelineParamArr = new VEClipTimelineParam[arrayList2.size()];
                int[] iArr3 = new int[arrayList2.size()];
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    vEClipTimelineParamArr[i4] = new VEClipTimelineParam();
                    vEClipTimelineParamArr[i4].trimIn = ((VEClipParam) arrayList2.get(i4)).trimIn;
                    vEClipTimelineParamArr[i4].trimOut = ((VEClipParam) arrayList2.get(i4)).trimOut;
                    vEClipTimelineParamArr[i4].speed = ((VEClipParam) arrayList2.get(i4)).speed;
                    iArr3[i4] = ((VEClipParam) arrayList2.get(i4)).clipIndex;
                    this.f191935b.setClipAttr(0, this.f191934a.f191764A, iArr3[i4], "clip rotate", new StringBuilder().append(((VEClipParam) arrayList2.get(i4)).clipRotate).toString());
                    C85315al.m146637a(C85559h.f191710a, "addTimeEffect updateVideoClip =" + ((VEClipParam) arrayList2.get(i4)).toString());
                }
                int updateClipsTimelineParam = this.f191935b.updateClipsTimelineParam(0, this.f191934a.f191764A, iArr3, vEClipTimelineParamArr);
                if (i3 < 0) {
                    C85315al.m146642d(C85559h.f191710a, "addTimeEffect updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam)));
                }
                if (this.f191934a.f191838e.f191690k == 1 && arrayList5.size() > 0) {
                    for (VEClipParam vEClipParam2 : arrayList3) {
                        VEClipSourceParam vEClipSourceParam2 = new VEClipSourceParam();
                        vEClipSourceParam2.clipFilePath = vEClipParam2.path;
                        vEClipSourceParam2.sourceType = 0;
                        VEClipTimelineParam vEClipTimelineParam2 = new VEClipTimelineParam();
                        vEClipTimelineParam2.trimIn = vEClipParam2.trimIn;
                        vEClipTimelineParam2.trimOut = vEClipParam2.trimOut;
                        vEClipTimelineParam2.speed = vEClipParam2.speed;
                        C85315al.m146637a(C85559h.f191710a, "addTimeEffect insertAudioClip =" + vEClipParam2.toString());
                        int insertClip2 = this.f191935b.insertClip(1, this.f191934a.f191838e.f191689j, vEClipParam2.clipIndex, vEClipSourceParam2, vEClipTimelineParam2);
                        if (insertClip2 < 0) {
                            C85315al.m146642d(C85559h.f191710a, "addTimeEffect insertAudioClip failed, ret = " + insertClip2 + " clipParam=" + vEClipParam2.toString());
                        }
                    }
                    VEClipTimelineParam[] vEClipTimelineParamArr2 = new VEClipTimelineParam[arrayList4.size()];
                    int[] iArr4 = new int[arrayList4.size()];
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        vEClipTimelineParamArr2[i5] = new VEClipTimelineParam();
                        vEClipTimelineParamArr2[i5].trimIn = ((VEClipParam) arrayList4.get(i5)).trimIn;
                        vEClipTimelineParamArr2[i5].trimOut = ((VEClipParam) arrayList4.get(i5)).trimOut;
                        vEClipTimelineParamArr2[i5].speed = ((VEClipParam) arrayList4.get(i5)).speed;
                        iArr4[i5] = ((VEClipParam) arrayList4.get(i5)).clipIndex;
                        C85315al.m146637a(C85559h.f191710a, "addTimeEffect updateAudioClip =" + ((VEClipParam) arrayList4.get(i5)).toString());
                    }
                    int updateClipsTimelineParam2 = this.f191935b.updateClipsTimelineParam(1, this.f191934a.f191838e.f191689j, iArr4, vEClipTimelineParamArr2);
                    if (updateClipsTimelineParam2 < 0) {
                        C85315al.m146642d(C85559h.f191710a, "addTimeEffect updateAudioClip failed, ret = ".concat(String.valueOf(updateClipsTimelineParam2)));
                    }
                }
                if (this.f191934a.f191838e.f191689j > 0) {
                    sparseArray = new SparseArray();
                } else {
                    sparseArray = null;
                }
                for (int i6 = 0; i6 < this.f191934a.f191838e.f191689j; i6++) {
                    sparseArray.put(i6, Float.valueOf(this.f191934a.mo131693h(i6)));
                }
                this.f191935b.setTrackVolume(0, this.f191934a.f191764A, trackVolume);
                if (this.f191934a.f191838e.f191690k == 1) {
                    this.f191935b.setTrackVolume(1, this.f191934a.f191838e.f191689j, f);
                }
                for (int i7 = 0; i7 < this.f191934a.f191838e.f191689j; i7++) {
                    this.f191935b.setTrackVolume(1, i7, ((Float) sparseArray.get(i7)).floatValue());
                }
                TEInterface tEInterface = this.f191935b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                if (z) {
                    this.f191935b.createTimeline();
                    this.f191935b.prepareEngine(0);
                }
                return iArr[0];
            } finally {
                MethodCollector.m26664o(14162);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r2 == 0) goto L_0x00b0;
     */
    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131121a(int r23, int r24, com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85617z.mo131121a(int, int, com.ss.android.vesdk.filterparam.VEBaseFilterParam, int, int):int");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131123a(int i, int i2, String str, byte[] bArr, int i3, VEListener.AbstractC85221a aVar) {
        int i4;
        MethodCollector.m26663i(14223);
        C85315al.m146637a("VEEditor_VEFilterInvoker", "enableAudioCommonFilter...");
        TEVideoUtils.nativeCancelCompileProbe();
        int duration = this.f191935b.getDuration();
        C30651j jVar = this.f191934a.f191852s;
        if (i == 1) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        int a = jVar.mo54955a(i4, i2);
        if (str.equals("")) {
            int[] addFilters = this.f191935b.addFilters(new int[]{a}, new String[]{"audio original filter"}, new int[]{i3}, new int[]{duration}, new int[]{i}, new int[]{1});
            C85315al.m146642d("VEEditor_VEFilterInvoker", "audio original filter " + addFilters[0] + " seqIn: " + i3);
            if (addFilters[0] < 0) {
                C85315al.m146642d("VEEditor_VEFilterInvoker", "Add filter failed!");
                MethodCollector.m26664o(14223);
                return -1;
            }
            C85315al.m146637a("VEEditor_VEFilterInvoker", "enableAudioOriginalFilter...filterIndex = " + addFilters[0] + ", seqIn = " + i3);
            int i5 = addFilters[0];
            MethodCollector.m26664o(14223);
            return i5;
        }
        int[] addFilters2 = this.f191935b.addFilters(new int[]{a}, new String[]{"audio common filter"}, new int[]{i3}, new int[]{duration}, new int[]{i}, new int[]{1});
        if (addFilters2[0] < 0) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "Add filter failed!");
            MethodCollector.m26664o(14223);
            return -1;
        }
        long[] jArr = new long[1];
        int preprocessAudioTrackForFilter = this.f191935b.preprocessAudioTrackForFilter(i, a, str, bArr, jArr);
        byte[] audioCommonFilterPreprocessResult = this.f191935b.getAudioCommonFilterPreprocessResult(jArr[0]);
        if (aVar != null) {
            aVar.mo130302a(str, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
        }
        if (preprocessAudioTrackForFilter != 0) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "Add filter preprocess failed!");
            MethodCollector.m26664o(14223);
            return -1;
        }
        this.f191935b.setFilterParam(addFilters2[0], "audio_common_filter_params", str);
        this.f191935b.setFilterParam(addFilters2[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
        C85315al.m146637a("VEEditor_VEFilterInvoker", "enableAudioCommonFilter...filterIndex " + addFilters2[0] + ", seqIn = " + i3);
        int i6 = addFilters2[0];
        MethodCollector.m26664o(14223);
        return i6;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85466c
    /* renamed from: a */
    public final int mo131122a(int i, int i2, String str, byte[] bArr, int i3, int i4, VEListener.AbstractC85221a aVar) {
        int i5;
        MethodCollector.m26663i(14210);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "addAudioCommonFilter failed path is null or path not exist");
            MethodCollector.m26664o(14210);
            return -205;
        }
        C85315al.m146637a("VEEditor_VEFilterInvoker", "addAudioCommonFilter... trackType = " + i + ", trackIndex = " + i2);
        TEVideoUtils.nativeCancelCompileProbe();
        C30651j jVar = this.f191934a.f191852s;
        if (i == 1) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int a = jVar.mo54955a(i5, i2);
        int[] addFilters = this.f191935b.addFilters(new int[]{a}, new String[]{"audio common filter"}, new int[]{i3}, new int[]{i4}, new int[]{i}, new int[]{1});
        if (addFilters[0] < 0) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "Add filter failed!");
            MethodCollector.m26664o(14210);
            return -1;
        }
        long[] jArr = new long[1];
        int preprocessAudioTrackForFilter = this.f191935b.preprocessAudioTrackForFilter(i, a, str, bArr, jArr);
        byte[] audioCommonFilterPreprocessResult = this.f191935b.getAudioCommonFilterPreprocessResult(jArr[0]);
        if (aVar != null) {
            aVar.mo130302a(str, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
        }
        if (preprocessAudioTrackForFilter != 0) {
            C85315al.m146642d("VEEditor_VEFilterInvoker", "Add filter preprocess failed!");
            MethodCollector.m26664o(14210);
            return -1;
        }
        this.f191935b.setFilterParam(addFilters[0], "audio_common_filter_params", str);
        this.f191935b.setFilterParam(addFilters[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
        int i6 = addFilters[0];
        MethodCollector.m26664o(14210);
        return i6;
    }
}
