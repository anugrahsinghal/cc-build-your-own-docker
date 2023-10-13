import java.util.Arrays;

// your_docker.sh run <image>       <command> <arg1> <arg2> ...
//                run ubuntu:latest /usr/local/bin/docker-explorer exit 1
//                run ubuntu:latest /usr/local/bin/docker-explorer ls /some_dir
//                run ubuntu:latest echo hey
public class Main {

  public static void main(String[] args) throws Exception {
    // You can use print statements as follows for debugging, they'll be visible when running tests.
    System.out.println("Logs from your program will appear here!");

    String[] commandWithArgs = Arrays.copyOfRange(args, 2, args.length);
    // Uncomment this block to pass the first stage!
    //
    //   ProcessBuilder processBuilder = new ProcessBuilder(commandWithArgs);
    //   processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
    //   processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
    //
    //   Process process = processBuilder.start();
    //
    //   int exitCode = process.waitFor();
    //
    //   if (exitCode != 0) {
    //     System.err.printf("Err: %d\n", exitCode);
    //     System.exit(1);
    //   }

  }
}
