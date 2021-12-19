package com.lynx.tasm.behavior.p2052ui.image;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;

/* renamed from: com.lynx.tasm.behavior.ui.image.AbsUIImage */
public abstract class AbsUIImage<T extends View> extends LynxUI<T> {
    static {
        Covode.recordClassIndex(34668);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            switch (nextKey.hashCode()) {
                case -1937917490:
                    if (nextKey.equals("cap-insets-scale")) {
                        setCapInsetsScale(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1249491252:
                    if (nextKey.equals("cover-start")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setCoverStart(z);
                        continue;
                    }
                    break;
                case -934531685:
                    if (nextKey.equals("repeat")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setRepeat(z3);
                        continue;
                    }
                    break;
                case -629825370:
                    if (nextKey.equals("loop-count")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setLoopCount(i);
                        continue;
                    }
                    break;
                case -256430480:
                    if (nextKey.equals("prefetch-width")) {
                        setPreFetchWidth(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSource(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 207594941:
                    if (nextKey.equals("prefetch-height")) {
                        setPreFetchHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 516005201:
                    if (nextKey.equals("cap-insets")) {
                        setCapInsetsBackUp(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 598246771:
                    if (nextKey.equals("placeholder")) {
                        setPlaceholder(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 681292984:
                    if (nextKey.equals("blur-radius")) {
                        setBlurRadius(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1198809474:
                    if (nextKey.equals("disable-default-placeholder")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setDisableDefaultPlaceholder(z2);
                        continue;
                    }
                    break;
                case 1515751784:
                    if (nextKey.equals("capInsets")) {
                        setCapInsets(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @AbstractC28525m(mo49059a = "blur-radius")
    public abstract void setBlurRadius(String str);

    @AbstractC28525m(mo49059a = "capInsets")
    public abstract void setCapInsets(String str);

    @AbstractC28525m(mo49059a = "cap-insets")
    public void setCapInsetsBackUp(String str) {
    }

    @AbstractC28525m(mo49059a = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
    }

    @AbstractC28525m(mo49059a = "cover-start", mo49064f = false)
    public abstract void setCoverStart(boolean z);

    @AbstractC28525m(mo49059a = "disable-default-placeholder", mo49064f = false)
    public void setDisableDefaultPlaceholder(boolean z) {
    }

    @AbstractC28525m(mo49059a = "loop-count")
    public abstract void setLoopCount(int i);

    @AbstractC28525m(mo49059a = "mode")
    public abstract void setObjectFit(String str);

    @AbstractC28525m(mo49059a = "placeholder")
    public abstract void setPlaceholder(String str);

    @AbstractC28525m(mo49059a = "prefetch-height")
    public abstract void setPreFetchHeight(String str);

    @AbstractC28525m(mo49059a = "prefetch-width")
    public abstract void setPreFetchWidth(String str);

    @AbstractC28525m(mo49059a = "repeat", mo49064f = false)
    public abstract void setRepeat(boolean z);

    @AbstractC28525m(mo49059a = "src")
    public abstract void setSource(String str);

    public AbsUIImage(AbstractC28520j jVar) {
        super(jVar);
    }
}
