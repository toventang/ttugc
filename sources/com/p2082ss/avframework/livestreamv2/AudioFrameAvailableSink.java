package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.AudioFrameAvailableSink */
public class AudioFrameAvailableSink extends AudioSink {
    private final Object mFence = new Object();
    private List<ILiveStream.IAudioFrameAvailableListener> mListeners = new ArrayList();
    private List<ILiveStream.IAudioFrameAvailableListener> mListenersToBeAdded = new ArrayList();
    private List<ILiveStream.IAudioFrameAvailableListener> mListenersToBeRemoved = new ArrayList();

    static {
        Covode.recordClassIndex(99996);
    }

    @Override // com.p2082ss.avframework.engine.AudioSink
    public void onNoData() {
    }

    public void addListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.m26663i(576);
        synchronized (this.mFence) {
            try {
                this.mListenersToBeRemoved.remove(iAudioFrameAvailableListener);
                if (!this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeAdded.contains(iAudioFrameAvailableListener)) {
                    this.mListenersToBeAdded.add(iAudioFrameAvailableListener);
                }
            } finally {
                MethodCollector.m26664o(576);
            }
        }
    }

    public void removeListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.m26663i(603);
        synchronized (this.mFence) {
            try {
                this.mListenersToBeAdded.remove(iAudioFrameAvailableListener);
                if (this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeRemoved.contains(iAudioFrameAvailableListener)) {
                    this.mListenersToBeRemoved.add(iAudioFrameAvailableListener);
                }
            } finally {
                MethodCollector.m26664o(603);
            }
        }
    }

    @Override // com.p2082ss.avframework.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        MethodCollector.m26663i(569);
        synchronized (this.mFence) {
            try {
                if (!this.mListenersToBeAdded.isEmpty()) {
                    this.mListeners.addAll(this.mListenersToBeAdded);
                    this.mListenersToBeAdded.clear();
                }
                if (!this.mListenersToBeRemoved.isEmpty()) {
                    this.mListeners.removeAll(this.mListenersToBeRemoved);
                    this.mListenersToBeRemoved.clear();
                }
            } finally {
                MethodCollector.m26664o(569);
            }
        }
        for (ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener : this.mListeners) {
            if (iAudioFrameAvailableListener != null) {
                buffer.position(0);
                iAudioFrameAvailableListener.onAudioFrameAvailable(buffer, i, i2, i3, j);
            }
        }
    }
}
