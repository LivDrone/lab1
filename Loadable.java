public interface Loadable<T> {
        void loadOn(T item);
        void loadOff(T item);
}
