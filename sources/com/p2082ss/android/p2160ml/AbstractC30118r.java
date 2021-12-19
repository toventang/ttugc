package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30097a;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import com.p2082ss.android.p2160ml.process.C30116f;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ml.r */
public abstract class AbstractC30118r implements AbstractC30090l {

    /* renamed from: a */
    private MLConfigModel f71850a;

    /* renamed from: b */
    private MappedByteBuffer f71851b;

    /* renamed from: c */
    private float[][] f71852c;

    /* renamed from: d */
    private ByteBuffer f71853d;

    /* renamed from: e */
    private int f71854e = -1;

    /* renamed from: f */
    private ArrayList<Float> f71855f = new ArrayList<>();

    /* renamed from: g */
    private boolean f71856g = false;

    /* renamed from: h */
    private C30094o f71857h;

    /* renamed from: i */
    private String f71858i = "ml#evaluator";

    static {
        Covode.recordClassIndex(36617);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo53442a(ByteBuffer byteBuffer, float[][] fArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo53443a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel);

    @Override // com.p2082ss.android.p2160ml.AbstractC30090l
    /* renamed from: a */
    public final void mo53457a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) {
        this.f71850a = mLConfigModel;
        FileChannel channel = fileInputStream.getChannel();
        this.f71851b = channel.map(FileChannel.MapMode.READ_ONLY, channel.position(), channel.size());
        int size = (mLConfigModel.output == null || mLConfigModel.output.labels == null) ? 1 : mLConfigModel.output.labels.size();
        if (size == 2) {
            size = 1;
        }
        int[] iArr = new int[2];
        iArr[1] = size;
        iArr[0] = 1;
        this.f71852c = (float[][]) Array.newInstance(float.class, iArr);
        this.f71856g = mo53443a(this.f71851b, mLConfigModel);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30090l
    /* renamed from: a */
    public final boolean mo53459a() {
        return this.f71856g;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30090l
    /* renamed from: a */
    public final void mo53456a(C30094o oVar) {
        this.f71857h = oVar;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30090l
    /* renamed from: a */
    public final void mo53458a(String str) {
        this.f71858i = str;
    }

    /* renamed from: b */
    private void m60905b(List<String> list, HashMap<String, Object> hashMap) {
        float f;
        this.f71855f.clear();
        for (String str : list) {
            Object a = C30078e.m60836a(hashMap, str);
            int i = 0;
            float f2 = 0.0f;
            if (a instanceof Number[]) {
                Number[] numberArr = (Number[]) a;
                while (i < numberArr.length) {
                    ArrayList<Float> arrayList = this.f71855f;
                    if (numberArr[i] != null) {
                        f = numberArr[i].floatValue();
                    } else {
                        f = 0.0f;
                    }
                    arrayList.add(Float.valueOf(f));
                    i++;
                }
                if (C30120t.f71860a) {
                    Arrays.toString(numberArr);
                }
            } else if (a instanceof float[]) {
                float[] fArr = (float[]) a;
                while (i < fArr.length) {
                    this.f71855f.add(Float.valueOf(fArr[i]));
                    i++;
                }
                if (C30120t.f71860a) {
                    Arrays.toString(fArr);
                }
            } else if (a instanceof Number) {
                Number number = (Number) a;
                ArrayList<Float> arrayList2 = this.f71855f;
                if (number != null) {
                    f2 = number.floatValue();
                }
                arrayList2.add(Float.valueOf(f2));
                if (C30120t.f71860a && number != null) {
                    number.floatValue();
                }
            } else {
                this.f71855f.add(Float.valueOf(0.0f));
            }
        }
        int size = this.f71855f.size() * 4;
        if (this.f71853d == null || size != this.f71854e) {
            this.f71854e = size;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size);
            this.f71853d = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        if (C30120t.f71860a) {
            this.f71855f.size();
        }
        this.f71853d.clear();
        Iterator<Float> it = this.f71855f.iterator();
        while (it.hasNext()) {
            this.f71853d.putFloat(it.next().floatValue());
        }
    }

    /* renamed from: a */
    private void m60904a(List<? extends AbstractC30113c> list, HashMap<String, Object> hashMap) {
        if (!(list == null || list.isEmpty())) {
            C30094o oVar = this.f71857h;
            if (oVar != null && oVar.f71819a) {
                oVar.f71830l.f71836a = System.currentTimeMillis();
            }
            for (AbstractC30113c cVar : list) {
                C30114d dVar = new C30114d(hashMap, cVar);
                String operator = cVar.getOperator();
                AbstractC30115e a = C30116f.f71846a.mo53498a(operator);
                if (a != null) {
                    try {
                        a.mo53485a(dVar);
                    } catch (Throwable th) {
                        C30120t.m60921a(th);
                    }
                } else {
                    throw new RuntimeException(operator + " don't support now");
                }
            }
            C30094o oVar2 = this.f71857h;
            if (oVar2 != null && oVar2.f71819a) {
                oVar2.f71830l.f71837b = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: a */
    private static void m60902a(AbstractC30097a aVar, Map<String, Float> map, float[][] fArr) {
        if (map != null && aVar.getLabels() != null && !aVar.getLabels().isEmpty()) {
            List<String> labels = aVar.getLabels();
            int size = labels.size();
            if (size == 2) {
                map.put(labels.get(0), Float.valueOf(1.0f - fArr[0][0]));
                map.put(labels.get(1), Float.valueOf(fArr[0][0]));
            } else if (size == fArr[0].length) {
                int i = 0;
                for (String str : labels) {
                    map.put(str, Float.valueOf(fArr[0][i]));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m60903a(AbstractC30097a aVar, float[] fArr, List<String> list) {
        if (aVar != null) {
            C30094o oVar = this.f71857h;
            if (oVar != null) {
                oVar.mo53479e();
            }
            C30114d dVar = new C30114d(fArr, list, aVar);
            String operator = aVar.getOperator();
            AbstractC30115e a = C30116f.f71846a.mo53498a(operator);
            if (a != null) {
                try {
                    a.mo53485a(dVar);
                } catch (Throwable th) {
                    C30120t.m60921a(th);
                }
                C30094o oVar2 = this.f71857h;
                if (oVar2 != null) {
                    oVar2.mo53480f();
                    return;
                }
                return;
            }
            throw new RuntimeException(operator + " don't support now");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    @Override // com.p2082ss.android.p2160ml.AbstractC30090l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo53454a(java.util.Map<java.lang.String, java.lang.Object> r6, java.util.List<? extends com.p2082ss.android.p2160ml.process.AbstractC30113c> r7, com.p2082ss.android.p2160ml.process.AbstractC30097a r8, java.util.List<java.lang.String> r9) {
        /*
            r5 = this;
            com.ss.android.ml.o r0 = r5.f71857h
            if (r0 == 0) goto L_0x0007
            r0.mo53475b()
        L_0x0007:
            r3 = 1
            r2 = 0
            r4 = 0
            float[][] r0 = r5.f71852c     // Catch:{ all -> 0x004e }
            r0 = r0[r4]     // Catch:{ all -> 0x004e }
            r0[r4] = r2     // Catch:{ all -> 0x004e }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x004e }
            r0.<init>(r6)     // Catch:{ all -> 0x004e }
            r5.m60904a(r7, r0)     // Catch:{ all -> 0x004e }
            r5.m60905b(r9, r0)     // Catch:{ all -> 0x004e }
            com.ss.android.ml.o r0 = r5.f71857h     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0022
            r0.mo53477c()     // Catch:{ all -> 0x004e }
        L_0x0022:
            java.nio.ByteBuffer r1 = r5.f71853d     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x002b
            float[][] r0 = r5.f71852c     // Catch:{ all -> 0x004e }
            r5.mo53442a(r1, r0)     // Catch:{ all -> 0x004e }
        L_0x002b:
            com.ss.android.ml.o r0 = r5.f71857h     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0032
            r0.mo53478d()     // Catch:{ all -> 0x004e }
        L_0x0032:
            float[][] r0 = r5.f71852c     // Catch:{ all -> 0x004e }
            r1 = r0[r4]     // Catch:{ all -> 0x004e }
            r0 = 0
            r5.m60903a(r8, r1, r0)     // Catch:{ all -> 0x004e }
            float[][] r1 = r5.f71852c     // Catch:{ all -> 0x004c }
            r0 = r1[r4]     // Catch:{ all -> 0x004c }
            r2 = r0[r4]     // Catch:{ all -> 0x004c }
            r0 = r1[r4]     // Catch:{ all -> 0x004c }
            r1 = r0[r4]     // Catch:{ all -> 0x004c }
            com.ss.android.ml.o r0 = r5.f71857h
            if (r0 == 0) goto L_0x004b
            r0.mo53473a(r3, r2)
        L_0x004b:
            return r1
        L_0x004c:
            r1 = move-exception
            goto L_0x0050
        L_0x004e:
            r1 = move-exception
            r3 = 0
        L_0x0050:
            com.ss.android.ml.o r0 = r5.f71857h
            if (r0 == 0) goto L_0x0057
            r0.mo53473a(r3, r2)
        L_0x0057:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.AbstractC30118r.mo53454a(java.util.Map, java.util.List, com.ss.android.ml.process.a, java.util.List):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    @Override // com.p2082ss.android.p2160ml.AbstractC30090l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo53455a(java.util.Map<java.lang.String, java.lang.Object> r7, java.util.List<? extends com.p2082ss.android.p2160ml.process.AbstractC30113c> r8, com.p2082ss.android.p2160ml.process.AbstractC30097a r9, java.util.List<java.lang.String> r10, java.util.Map<java.lang.String, java.lang.Float> r11) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.AbstractC30118r.mo53455a(java.util.Map, java.util.List, com.ss.android.ml.process.a, java.util.List, java.util.Map):java.util.List");
    }
}
