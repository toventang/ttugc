package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.p2050c.p2051a.C28479a;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.utils.C28929m;
import java.util.Map;

public final class PaintingContext {

    /* renamed from: a */
    public final C28479a f66940a;

    /* renamed from: b */
    private final C28529q f66941b;

    static {
        Covode.recordClassIndex(34460);
    }

    public final void flush() {
        this.f66940a.mo48991a();
    }

    public final void FinishLayoutOperation(long j) {
        this.f66940a.mo49006b(j);
    }

    public final void FinishTasmOperation(long j) {
        this.f66940a.mo49000a(j);
    }

    public final void onAnimatedNodeReady(int i) {
        this.f66940a.mo49004b(i);
    }

    public final void validate(int i) {
        this.f66940a.mo48992a(i);
    }

    public final void onCollectExtraUpdates(int i) {
        ShadowNode b = this.f66941b.f67111c.mo49041b(i);
        if (b != null) {
            b.mo26068a(this);
        }
    }

    public final void setKeyframes(ReadableMap readableMap) {
        if (this.f66941b.f67111c.f67076q) {
            this.f66941b.f67111c.mo49036a(readableMap.getMap("keyframes"));
        } else {
            this.f66940a.mo49001a(readableMap);
        }
    }

    public final float[] getBoundingClientOrigin(int i) {
        float[] fArr = {0.0f, 0.0f};
        LynxBaseUI a = this.f66941b.mo49070a(i);
        if (a != null) {
            Rect boundingClientRect = a.getBoundingClientRect();
            fArr[0] = (float) boundingClientRect.left;
            fArr[1] = (float) boundingClientRect.top;
        }
        return fArr;
    }

    public final float[] getRectToWindow(int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI a = this.f66941b.mo49070a(i);
        if (a != null) {
            Rect rectToWindow = a.getRectToWindow();
            fArr[0] = (float) rectToWindow.left;
            fArr[1] = (float) rectToWindow.top;
            fArr[2] = (float) rectToWindow.width();
            fArr[3] = (float) rectToWindow.height();
        }
        return fArr;
    }

    public PaintingContext(C28529q qVar, C28479a aVar) {
        this.f66941b = qVar;
        this.f66940a = aVar;
    }

    public final void destroyNode(int i, int i2) {
        this.f66940a.mo49005b(i, i2);
    }

    public final void removeNode(int i, int i2) {
        this.f66940a.mo48994a(i, i2);
    }

    public final void updateFlattenStatus(int i, boolean z) {
        this.f66940a.mo48998a(i, z);
    }

    public final void setTransitionData(int i, float[] fArr) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setTransitionData(fArr);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void insertNode(int i, int i2, int i3) {
        this.f66940a.mo48995a(i, i2, i3);
    }

    public final void updateProps(int i, boolean z, ReadableMap readableMap) {
        this.f66940a.mo48999a(i, z, readableMap);
    }

    public final void setAnimationData(int i, String[] strArr, float[] fArr) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setAnimationData(strArr, fArr);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setAttributes(int i, ReadableMap readableMap, ReadableArray readableArray) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28716v vVar = null;
                if (readableMap != null) {
                    vVar = new C28716v(readableMap);
                }
                LynxBaseUI c = C28529q.m57045c(lynxBaseUI);
                c.setAttributes(vVar);
                if (readableArray != null) {
                    c.setEvents(C28529q.m57037a(readableArray));
                    return;
                }
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setStringAttributes(int i, String[] strArr, String[] strArr2) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                int length = strArr.length;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                for (int i2 = 0; i2 < length; i2++) {
                    javaOnlyMap.putString(strArr[i2], strArr2[i2]);
                }
                C28529q.m57045c(lynxBaseUI).setAttributes(new C28716v(javaOnlyMap));
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setOutlineData(int i, float f, int i2, int i3) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setOutlineData(f, i2, i3);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setTextStyleData(int i, int[] iArr, double[] dArr, String str) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setTextStyleData(iArr, dArr, str);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void createNode(int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        C28716v vVar;
        C28479a aVar = this.f66940a;
        if (readableMap != null) {
            vVar = new C28716v(readableMap);
        } else {
            vVar = null;
        }
        Map<String, C28723a> a = C28723a.m57533a(readableArray);
        TraceEvent.m56864a(0, "UIOperationQueue.createNode.enqueueCreateView");
        aVar.mo48997a(i, str, vVar, a, z);
        TraceEvent.m56869b(0, "UIOperationQueue.createNode.enqueueCreateView");
    }

    public final long measureText(int i, float f, int i2, float f2, int i3) {
        C28529q qVar = this.f66941b;
        if (qVar == null) {
            return 0;
        }
        EnumC28540e fromInt = EnumC28540e.fromInt(i2);
        EnumC28540e fromInt2 = EnumC28540e.fromInt(i3);
        LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            return lynxBaseUI.measureText(f, fromInt, f2, fromInt2);
        }
        throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
    }

    public final void setTransformData(int i, float f, float f2, int[] iArr, float[] fArr) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setTransformData(f, f2, iArr, fArr);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setSingleValueStyleData(int i, int[] iArr, float f, int i2, int i3, int i4) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setSingleValueStyleData(iArr, f, i2, i3, i4);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void UpdateLayoutPatching(int[] iArr, int[][] iArr2, int[][] iArr3, int[][] iArr4, float[][] fArr, float[][] fArr2, int[] iArr5) {
        Rect rect;
        PaintingContext paintingContext = this;
        if (paintingContext.f66941b != null) {
            int length = iArr.length;
            char c = 0;
            int i = 0;
            while (i < length) {
                C28529q qVar = paintingContext.f66941b;
                int i2 = iArr[i];
                int i3 = iArr2[i][c];
                int i4 = iArr2[i][1];
                int i5 = iArr2[i][2];
                int i6 = iArr2[i][3];
                int i7 = iArr3[i][c];
                int i8 = iArr3[i][1];
                int i9 = iArr3[i][2];
                int i10 = iArr3[i][3];
                int i11 = iArr4[i][c];
                int i12 = iArr4[i][1];
                int i13 = iArr4[i][2];
                int i14 = iArr4[i][3];
                if (fArr[i] != null) {
                    rect = new Rect((int) fArr[i][c], (int) fArr[i][1], (int) fArr[i][2], (int) fArr[i][3]);
                } else {
                    rect = null;
                }
                qVar.mo49078a(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, rect, fArr2[i], iArr5[i]);
                i++;
                paintingContext = this;
                c = 0;
            }
        }
    }

    public final void setShadowData(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr, int[] iArr2) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                if (!(lynxBaseUI instanceof UIShadowProxy) && lynxBaseUI.mParent != null && !(lynxBaseUI.mParent instanceof UIShadowProxy)) {
                    LynxBaseUI lynxBaseUI2 = (LynxBaseUI) lynxBaseUI.mParent;
                    int index = lynxBaseUI2.getIndex(lynxBaseUI);
                    qVar.mo49076a(lynxBaseUI2.getSign(), lynxBaseUI.getSign());
                    LynxUI enclosingLynxUI = lynxBaseUI2.enclosingLynxUI();
                    qVar.f67113e.remove(Integer.valueOf(lynxBaseUI.getSign()));
                    UIShadowProxy uIShadowProxy = new UIShadowProxy(qVar.f67111c, lynxBaseUI);
                    qVar.f67113e.put(Integer.valueOf(uIShadowProxy.getSign()), uIShadowProxy);
                    qVar.mo49084b(enclosingLynxUI.getSign(), uIShadowProxy.getSign(), index);
                }
                lynxBaseUI.setShadowData(fArr, fArr2, fArr3, fArr4, iArr, iArr2);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setBackgroundData(int i, int i2, ReadableMap readableMap, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int[] iArr3) {
        ReadableArray readableArray;
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            if (readableMap != null) {
                readableArray = readableMap.getArray("background-image");
            } else {
                readableArray = null;
            }
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setBackgroundData(i2, readableArray, fArr, fArr2, iArr, iArr2, iArr3);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void updateUITreeOperations(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, boolean[] zArr, boolean[] zArr2, int[] iArr4, int[] iArr5) {
        UIShadowProxy a;
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArr4[i];
                if (i2 == 0) {
                    int i3 = iArr[i];
                    String str = strArr[i];
                    boolean z = zArr[i];
                    boolean z2 = zArr2[i];
                    int i4 = iArr5[i];
                    String concat = "UIOwner.createView.".concat(String.valueOf(str));
                    TraceEvent.m56864a(0, concat);
                    C28929m.m57951b();
                    if (qVar.f67109a >= 0 || !str.equals("page")) {
                        a = qVar.mo49073a(str, z);
                    } else {
                        a = qVar.f67110b;
                        qVar.f67109a = i3;
                    }
                    a.setSign(i3, str);
                    a.setDefaultOverflow();
                    if (z2) {
                        a = new UIShadowProxy(qVar.f67111c, a);
                    }
                    qVar.f67112d.add(str);
                    if (str.equals("component") && i4 != -1) {
                        qVar.f67114f.put(Integer.valueOf(i4), Integer.valueOf(i3));
                    }
                    qVar.f67113e.put(Integer.valueOf(i3), a);
                    TraceEvent.m56869b(0, concat);
                } else if (i2 == 1) {
                    qVar.mo49084b(iArr2[i], iArr[i], iArr3[i]);
                } else if (i2 == 2) {
                    int i5 = iArr[i];
                    if (qVar.f67113e.size() <= 0) {
                        continue;
                    } else {
                        LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i5));
                        if (lynxBaseUI != null) {
                            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                            if (parentBaseUI == null) {
                                LLog.m56861c("LynxUIOwner", "parent is null for tag: " + i5 + ", the child may be recreated");
                            } else {
                                String str2 = "UIOwner.removeFiber." + parentBaseUI.mTagName + "." + lynxBaseUI.mTagName;
                                TraceEvent.m56864a(0, str2);
                                parentBaseUI.removeChildFiber(lynxBaseUI);
                                TraceEvent.m56869b(0, str2);
                            }
                        } else {
                            throw new RuntimeException("Trying to remove unknown ui signature: ".concat(String.valueOf(i5)));
                        }
                    }
                } else if (i2 == 3) {
                    qVar.mo49086c(iArr[i]);
                } else if (i2 == 4) {
                    int i6 = iArr[i];
                    boolean z3 = zArr[i];
                    LynxBaseUI lynxBaseUI2 = qVar.f67113e.get(Integer.valueOf(i6));
                    String str3 = "UIOwner.updateFlatten." + lynxBaseUI2.mTagName;
                    TraceEvent.m56864a(0, str3);
                    if (!(lynxBaseUI2 instanceof UIGroup)) {
                        lynxBaseUI2.destroy();
                    }
                    LynxBaseUI a2 = qVar.mo49073a(lynxBaseUI2.mTagName, z3);
                    a2.setSign(lynxBaseUI2.getSign(), lynxBaseUI2.mTagName);
                    a2.setAttributes(new C28716v(lynxBaseUI2.getProps()));
                    qVar.f67113e.put(Integer.valueOf(lynxBaseUI2.getSign()), a2);
                    TraceEvent.m56869b(0, str3);
                }
            }
        }
    }

    public final void setLayoutAnimationData(int i, int i2, long j, long j2, int i3, int i4, float f, float f2, float f3, float f4, int i5) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setLayoutAnimationData(i2, j, j2, i3, i4, f, f2, f3, f4, i5);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }

    public final void setLayoutData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float[] fArr, float[] fArr2, int i14) {
        Rect rect;
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            if (fArr != null) {
                rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
            } else {
                rect = null;
            }
            qVar.mo49078a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect, fArr2, i14);
        }
    }

    public final void updateLayout(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float[] fArr2, float f17) {
        this.f66940a.mo48993a(i, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, fArr, fArr2, f17);
    }

    public final void setBorderData(int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i6, int i7, int i8, int i9) {
        C28529q qVar = this.f66941b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C28529q.m57045c(lynxBaseUI).setBorderData(f, f2, f3, f4, i2, i3, i4, i5, f5, f6, f7, f8, f9, f10, f11, f12, i6, i7, i8, i9);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
        }
    }
}
