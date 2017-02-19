package com.hsalf.sharedhandler;

/**
 * Created by sujith on 19/2/17.
 */
public class SharedHandler {

    private static final String TAG = "SharedHandler";

    private static final SharedHandler INSTANCE = new SharedHandler();

    /**
     * Empty private constructor to avoid others to create instance
     */
    private SharedHandler() {

    }

    private DebuggerImpl mDebugger;

    /**
     * To start debugging the shared prefs
     *
     * @return
     */
    public static Debugger debug() {
        return getHandler().getDebugger();
    }

    /**
     * To end the debugging of shared prefs
     */
    public static void end() {
        getHandler().release();
    }

    private static SharedHandler getHandler() {
        return INSTANCE;
    }

    private DebuggerImpl getDebugger() {
        DebuggerImpl debugger = getHandler().mDebugger;
        if (debugger == null) {
            debugger = new DebuggerImpl(this);
        }
        debugger.collect();
        return debugger;
    }

    private void release() {
        if (mDebugger != null) {
            mDebugger.release();
            mDebugger = null;
        }
    }

    private static class DebuggerImpl implements Debugger {

        private SharedHandler sharedHandler;

        public DebuggerImpl(SharedHandler sharedHandler) {
            this.sharedHandler = sharedHandler;
        }

        public void release() {

        }

        public void collect() {

        }
    }

    public interface Debugger {

    }

}
