package Question_number_3;

    public class QueueUsingStacks {
        private Stack stack1;
        private Stack stack2;

        public QueueUsingStacks() {
            stack1 = new Stack(6);
            stack2 = new Stack(6);
        }


        public void enqueue(int x) {
            stack1.push(x);
        }


        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty. Cannot dequeue.");
            }


            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }


        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty. Cannot peek.");
            }


            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }


        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

    }



